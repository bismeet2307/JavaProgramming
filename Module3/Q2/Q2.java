package Module3.Q2;

class MyRunnable implements Runnable {
    public void run() {
        String str = "MULTITHREADING";
        for (int i= str.length() -1;i>=0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
    
}
