package Module3.Q4;

// thread1
class Thread1 extends Thread {
    public void run() {
        try {
            for (int i=10; i>=1;i--){
                System.out.println(i);
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
            for(int i= 1; i<=20;i++) {
                System.out.println("Tick...");
                Thread.sleep(500);
            }
            
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Q4 {
    public static void main (String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}