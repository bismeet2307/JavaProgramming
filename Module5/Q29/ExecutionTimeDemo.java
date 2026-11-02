import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime { }

class ReportService {
    @LogExecutionTime
    public void generateReport() throws InterruptedException {
        Thread.sleep(150);
        System.out.println("Report generated.");
    }
}

public class ExecutionTimeDemo {
    public static void main(String[] args) throws Exception {
        ReportService service = new ReportService();
        Method method = ReportService.class.getMethod("generateReport");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            try {
                method.invoke(service);
            } finally {
                long elapsed = System.nanoTime() - start;
                System.out.printf("Execution time: %.3f ms%n", elapsed / 1_000_000.0);
            }
        } else {
            method.invoke(service);
        }
    }
}
