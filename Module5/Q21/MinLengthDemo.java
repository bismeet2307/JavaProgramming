import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class User {
    @MinLength(3)
    String name = "Al";

    @MinLength(8)
    String password = "securePass";
}

public class MinLengthDemo {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        for (Field field : User.class.getDeclaredFields()) {
            MinLength annotation = field.getAnnotation(MinLength.class);
            if (annotation == null) continue;
            field.setAccessible(true);
            Object value = field.get(user);
            if (value instanceof String) {
                String text = (String) value;
                System.out.printf("%s: %s (minimum %d)%n", field.getName(),
                        text.length() >= annotation.value() ? "VALID" : "INVALID",
                        annotation.value());
            }
        }
    }
}
