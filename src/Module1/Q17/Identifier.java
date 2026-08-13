// valid invalid
public class Identifier {
    public static void main(String[] args) {

        // valid

        int age = 19;
        int studentAge = 20;
        int student_age = 21;
        int $salary = 50000;
        int marks1 = 90;

        System.out.println("Valid identifiers:");

        System.out.println("age = " + age);
        System.out.println("studentAge = " + studentAge);
        System.out.println("student_age = " + student_age);
        System.out.println("$salary = " + $salary);
        System.out.println("marks1 = " + marks1);

        /*
         * INVALID IDENTIFIERS:
         *
         * int 1age = 19;
         * Cannot start with a number.
         *
         * int student-age = 20;
         * Hyphen is not allowed.
         *
         * int student age = 20;
         * Space is not allowed.
         *
         * int class = 10;
         * 'class' is a Java keyword.
         *
         * int @marks = 90;
         * @ is not allowed in an identifier.
         */

        System.out.println();
        System.out.println("Examples of invalid identifiers:");
        System.out.println("1age       -> starts with a number");
        System.out.println("student-age -> contains hyphen");
        System.out.println("student age -> contains space");
        System.out.println("class       -> Java keyword");
        System.out.println("@marks      -> contains invalid symbol");
    }
}