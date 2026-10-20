
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // calling scanner func() for taking input from a user.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll number:");
        int rollNumber = sc.nextInt();
        System.out.println(rollNumber);

        System.out.println("Enter name:");
        String str = sc.next();
        System.out.println("String is " + str);

        sc.close();
    }
}
