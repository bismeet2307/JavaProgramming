package Module3.Q9;

class NumberPrinter {

    private int number = 1;

    public synchronized void printOdd() {

        try {

            while (number <= 20) {

                while (number % 2 == 0) {
                    wait();
                }

                if (number <= 20) {
                    System.out.println("Odd Thread: " + number);
                    number++;

                    notify();
                }
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void printEven() {

        try {

            while (number <= 20) {

                while (number % 2 != 0) {
                    wait();
                }

                if (number <= 20) {
                    System.out.println("Even Thread: " + number);
                    number++;

                    notify();
                }
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {

    private NumberPrinter printer;

    OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printOdd();
    }
}

class EvenThread extends Thread {

    private NumberPrinter printer;

    EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printEven();
    }
}

public class OddEvenNumberSynchronization {

    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        OddThread odd = new OddThread(printer);
        EvenThread even = new EvenThread(printer);

        odd.start();
        even.start();
    }
}