package Module3.Q13;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class DeadlockFixedWithTryLock {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            try {

                if (lock1.tryLock(1, TimeUnit.SECONDS)) {

                    try {

                        System.out.println("Thread 1 acquired lock1");

                        if (lock2.tryLock(1, TimeUnit.SECONDS)) {

                            try {
                                System.out.println(
                                        "Thread 1 acquired lock2");
                            } finally {
                                lock2.unlock();
                            }

                        } else {
                            System.out.println(
                                    "Thread 1 could not acquire lock2");
                        }

                    } finally {
                        lock1.unlock();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread thread2 = new Thread(() -> {

            try {

                if (lock2.tryLock(1, TimeUnit.SECONDS)) {

                    try {

                        System.out.println("Thread 2 acquired lock2");

                        if (lock1.tryLock(1, TimeUnit.SECONDS)) {

                            try {
                                System.out.println(
                                        "Thread 2 acquired lock1");
                            } finally {
                                lock1.unlock();
                            }

                        } else {
                            System.out.println(
                                    "Thread 2 could not acquire lock1");
                        }

                    } finally {
                        lock2.unlock();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
