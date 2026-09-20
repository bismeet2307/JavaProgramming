package Module3.Q3;
class Thread1 extends Thread {
    public void run() {
        try {
            while(true){
                System.out.println("Thread 1");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
}
class Thread2 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Thread 2");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Q3 {
    public static void main (String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}