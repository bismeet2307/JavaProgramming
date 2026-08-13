class Employee {

    String name;
    int id;
    double salary;

    // Parameterized constructor
    Employee(String name, int id, double salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class ParaConstruct {
    public static void main(String[] args) {

        Employee e = new Employee("Bisu", 101, 50000);

        e.display();
    }
}