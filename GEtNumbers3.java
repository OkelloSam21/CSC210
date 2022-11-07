/*
 * this program handles exception using try catch block
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class GEtNumbers3 {
    public static void main(String[] args) {
        try (Scanner stdin = new Scanner(System.in)) {
            int firstNumber =0;
            int secondNumber = 0;
            boolean done = false;
            while (!done) {
                        try {
                            System.out.print("\n\nEnter the first non-negative number : ");
                            firstNumber = stdin.nextInt();
                            System.out.print("Enter the second non-negative number : ");
                            secondNumber = stdin.nextInt();
                            done = true;
                
            } catch (InputMismatchException e) {
                // TO DO: handle exception
                stdin.nextLine();
                System.out.println("!error...Input Mismatch!!");
                System.out.println("Try again.");
            }
            }
            System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
        }
        
    }
}
