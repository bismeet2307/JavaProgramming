import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value();
}

class Registration {
    @MinLength(5)
    private String username = "Asha";

    @MinLength(8)
    private String password = "java1234";
}

public class MinLengthValidationDemo {
    static void validate(Object object) throws IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            MinLength rule = field.getAnnotation(MinLength.class);
            if (rule == null) continue;

            field.setAccessible(true);
            Object value = field.get(object);
            if (!(value instanceof String)) {
                System.out.println(field.getName() + ": @MinLength applies to String fields only.");
                continue;
            }

            String text = (String) value;
            if (text.length() < rule.value()) {
                System.out.println(field.getName() + " must contain at least "
                        + rule.value() + " characters.");
            } else {
                System.out.println(field.getName() + " is valid.");
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        validate(new Registration());
    }
}
