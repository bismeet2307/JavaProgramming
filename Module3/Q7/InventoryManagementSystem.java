package Module3.Q7;

class Inventory {

    private int stock = 10;

    public void sellProduct(String customer, int quantity) {

        System.out.println(customer + " wants to buy " + quantity + " item(s).");

        synchronized (this) {

            if (stock >= quantity) {

                System.out.println("Stock available for " + customer);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                stock -= quantity;

                System.out.println(customer + " purchased "
                        + quantity + " item(s).");

                System.out.println("Remaining stock: " + stock);

            } else {

                System.out.println("Not enough stock for " + customer);
            }
        }
    }
}

class Customer extends Thread {

    private Inventory inventory;
    private int quantity;

    Customer(Inventory inventory, String name, int quantity) {
        super(name);
        this.inventory = inventory;
        this.quantity = quantity;
    }

    public void run() {
        inventory.sellProduct(getName(), quantity);
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Customer c1 = new Customer(inventory, "Customer-1", 3);
        Customer c2 = new Customer(inventory, "Customer-2", 4);
        Customer c3 = new Customer(inventory, "Customer-3", 5);

        c1.start();
        c2.start();
        c3.start();
    }
}