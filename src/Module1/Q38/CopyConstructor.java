class Student {

    String name;
    int age;

    // Normal parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Student s1 = new Student("Bisu", 19);

        // Copy s1 into s2
        Student s2 = new Student(s1);

        System.out.println("Original object:");
        s1.display();

        System.out.println("\nCopied object:");
        s2.display();
    }
}