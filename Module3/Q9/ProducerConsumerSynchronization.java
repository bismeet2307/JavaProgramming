package Module3.Q9;

class SharedData {

    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {

        try {

            while (available) {
                wait();
            }

            data = value;
            available = true;

            System.out.println("Producer produced: " + data);

            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void consume() {

        try {

            while (!available) {
                wait();
            }

            System.out.println("Consumer consumed: " + data);

            available = false;

            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Producer extends Thread {

    private SharedData sharedData;

    Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            sharedData.produce(i);
        }
    }
}

class Consumer extends Thread {

    private SharedData sharedData;

    Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            sharedData.consume();
        }
    }
}

public class ProducerConsumerSynchronization {

    public static void main(String[] args) {

        SharedData sharedData = new SharedData();

        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}