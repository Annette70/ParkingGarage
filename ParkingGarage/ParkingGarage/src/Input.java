import java.util.Random;
import java.util.Scanner;

/**
 * Displays the Parking Garage menu
 * Takes user input
 * returns user input
 */

public class Input {

    static Scanner keyboard = new Scanner(System.in);

    public static int CheckInMenu() {
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("1 - Check/In");
        System.out.println("3 - Close Garage");
        System.out.println("4 - Special Event");
        System.out.print("=>");
        return keyboard.nextInt();

    }

    public static int CheckOutMenu() {
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        System.out.print("=>");
        return keyboard.nextInt();
    }
}
