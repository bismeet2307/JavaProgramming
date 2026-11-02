import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String value();
}

class Person {
    @JsonField("full_name")
    private String name = "Asha";

    @JsonField("email_address")
    private String email = "asha@example.com";
}

public class JsonFieldDemo {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        StringBuilder json = new StringBuilder("{");
        boolean first = true;
        for (Field field : Person.class.getDeclaredFields()) {
            JsonField mapping = field.getAnnotation(JsonField.class);
            if (mapping == null) continue;
            field.setAccessible(true);
            Object value = field.get(person);
            if (!first) json.append(", ");
            json.append('"').append(escape(mapping.value())).append("\": ");
            json.append('"').append(escape(String.valueOf(value))).append('"');
            first = false;
        }
        json.append("}");
        System.out.println(json);
    }

    private static String escape(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
