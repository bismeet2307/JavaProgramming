// encapsulation using student class
package Q1;
class Student {
    private String name;
    private int rollno;

    public void setName(String n) {
        name =n;
    }
    public void setRollno(int r) {
        rollno = r;
    }

    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Bismeet");
        s.setRollno(48);

        System.out.println("Name is: " + s.getName());
        System.out.println("Roll number is: " + s.getRollno());
    }

}