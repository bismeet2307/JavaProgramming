package Module3.Q11;

import java.util.concurrent.locks.ReentrantLock;

class SafeCounter {

    private int count = 0;

    private ReentrantLock lock = new ReentrantLock();

    public void increment() {

        lock.lock();

        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class SafeCounterThread extends Thread {

    private SafeCounter counter;

    SafeCounterThread(SafeCounter counter) {
        this.counter = counter;
    }

    public void run() {

        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class CounterWithReentrantLock {

    public static void main(String[] args) throws InterruptedException {

        SafeCounter counter = new SafeCounter();

        SafeCounterThread t1 = new SafeCounterThread(counter);
        SafeCounterThread t2 = new SafeCounterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter with ReentrantLock: "
                + counter.getCount());
    }
}