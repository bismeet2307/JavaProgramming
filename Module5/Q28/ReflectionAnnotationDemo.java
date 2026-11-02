import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface Info {
    String value();
}

@Info("Demonstrates runtime annotation processing")
class Calculator {
    @Info("Adds two integers")
    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Class<Calculator> type = Calculator.class;
        Info classInfo = type.getAnnotation(Info.class);
        System.out.println("Class: " + classInfo.value());

        for (Method method : type.getDeclaredMethods()) {
            Info methodInfo = method.getAnnotation(Info.class);
            if (methodInfo != null) {
                System.out.println(method.getName() + ": " + methodInfo.value());
            }
        }

        Calculator calculator = type.getDeclaredConstructor().newInstance();
        System.out.println("Result: " + calculator.add(10, 20));
    }
}
