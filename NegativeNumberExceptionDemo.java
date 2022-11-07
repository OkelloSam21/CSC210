
import java.util.Scanner;

public class NegativeNumberExceptionDemo {
   public static void main(String[] args) {

    int firstNumber = 0;
    int secondNumber = 0;
    Scanner sc = new Scanner(System.in);
    try {
        

        System.out.print("\n\nEnter the first non-negative number : ");
        firstNumber = sc.nextInt();

        System.out.print("Enter the second non-negative number : ");
        secondNumber = sc.nextInt();
            if (firstNumber < 0 || secondNumber < 0) {
                throw new NegativeNumberException();
            }
    } catch (NegativeNumberException e) {
                // TO: handle exception
                System.out.println(e.getMessage());
            
            }
    System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);

    }
}
