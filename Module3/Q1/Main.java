package Module3.Q1;

class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=20; i++) {
            System.out.println(i);
        }    
    
    try {
        Thread.sleep(500);
    }
    catch(InterruptedException e) {
        System.out.println(e);
    }
}
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
    
}
