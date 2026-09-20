package Module3.Q6;

class TicketCounter {

    private int availableTickets = 5;

    // Synchronized method
    public synchronized void bookTicket(String user, int tickets) {

        System.out.println(user + " is trying to book " + tickets + " ticket(s).");

        if (availableTickets >= tickets) {

            System.out.println("Tickets available for " + user);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableTickets -= tickets;

            System.out.println(user + " successfully booked "
                    + tickets + " ticket(s).");

            System.out.println("Tickets remaining: " + availableTickets);

        } else {

            System.out.println("Sorry " + user
                    + ", not enough tickets available.");
        }
    }
}

class User extends Thread {

    private TicketCounter counter;
    private int tickets;

    User(TicketCounter counter, String name, int tickets) {
        super(name);
        this.counter = counter;
        this.tickets = tickets;
    }

    public void run() {
        counter.bookTicket(getName(), tickets);
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter();

        User user1 = new User(counter, "User-1", 2);
        User user2 = new User(counter, "User-2", 2);
        User user3 = new User(counter, "User-3", 2);

        user1.start();
        user2.start();
        user3.start();
    }
}