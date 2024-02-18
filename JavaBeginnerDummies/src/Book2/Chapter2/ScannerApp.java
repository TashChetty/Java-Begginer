package Book2.Chapter2;
import java.util.Scanner;
public class ScannerApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");

        if(sc.hasNextInt())
        {
            int x = sc.nextInt();
            System.out.println("you entered an interger:  " + x + ".");

        }else {
            System.out.println("incorrect!!! you did not enter an integer. Please try again");
        }
    }
}
