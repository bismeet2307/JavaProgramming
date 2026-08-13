// Control statements
public class Control {
    public static void main(String[] args) {

        int number = 10;

        // if-else
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // switch
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }

        // for loop
        System.out.println("Numbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}