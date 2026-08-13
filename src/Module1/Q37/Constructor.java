class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Bisu");

        Student s3 = new Student("Rahul", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}