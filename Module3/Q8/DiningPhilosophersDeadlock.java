package Module3.Q8;

class Chopstick {

    private String name;

    Chopstick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Philosopher extends Thread {

    private Chopstick firstChopstick;
    private Chopstick secondChopstick;

    Philosopher(String name,
                Chopstick firstChopstick,
                Chopstick secondChopstick) {

        super(name);
        this.firstChopstick = firstChopstick;
        this.secondChopstick = secondChopstick;
    }

    public void run() {

        synchronized (firstChopstick) {

            System.out.println(getName()
                    + " picked up " + firstChopstick.getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (secondChopstick) {

                System.out.println(getName()
                        + " picked up " + secondChopstick.getName());

                System.out.println(getName() + " is eating.");
            }
        }
    }
}

public class DiningPhilosophersDeadlock {

    public static void main(String[] args) {

        Chopstick chopstick1 = new Chopstick("Chopstick-1");
        Chopstick chopstick2 = new Chopstick("Chopstick-2");

        Philosopher philosopher1 =
                new Philosopher(
                        "Philosopher-1",
                        chopstick1,
                        chopstick2);

        Philosopher philosopher2 =
                new Philosopher(
                        "Philosopher-2",
                        chopstick2,
                        chopstick1);

        philosopher1.start();
        philosopher2.start();
    }
}