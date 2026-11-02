import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Role("ADMIN")
@Role("EDITOR")
class Account { }

public class RepeatableAnnotationDemo {
    public static void main(String[] args) {
        for (Role role : Account.class.getAnnotationsByType(Role.class)) {
            System.out.println(role.value());
        }
    }
}
