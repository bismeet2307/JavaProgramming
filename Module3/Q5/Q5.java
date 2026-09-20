package Module3.Q5;

class Worker extends Thread {

    Worker(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                getName() +
                " | Priority: " +
                getPriority() +
                " | Execution: " +
                i
            );
        }
    }
}

public class Q5 {

    public static void main(String[] args) {

        Worker w1 = new Worker("Worker-1");
        Worker w2 = new Worker("Worker-2");
        Worker w3 = new Worker("Worker-3");

        w1.setPriority(Thread.MIN_PRIORITY);  // 1
        w2.setPriority(Thread.NORM_PRIORITY); // 5
        w3.setPriority(Thread.MAX_PRIORITY);  // 10

        w1.start();
        w2.start();
        w3.start();
    }
}