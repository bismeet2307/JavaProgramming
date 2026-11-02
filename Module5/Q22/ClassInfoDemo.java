import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ClassInfo {
    String author();
    String version() default "1.0";
}

@ClassInfo(author = "Bismeet", version = "2.0")
class PaymentService { }

public class ClassInfoDemo {
    public static void main(String[] args) {
        ClassInfo info = PaymentService.class.getAnnotation(ClassInfo.class);
        System.out.println("Author: " + info.author());
        System.out.println("Version: " + info.version());
    }
}
