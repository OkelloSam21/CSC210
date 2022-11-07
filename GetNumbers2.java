/**
 * GetNumbers2
 */
import java.util.*;

public class GetNumbers2 {
public static void main(String[] args) {
    try (Scanner stdin = new Scanner(System.in)) {
        System.out.print("\n\nEnter the first non-negative number : ");
        int firstNumber = stdin.nextInt();

        System.out.print("Enter the second non-negative number : ");
        int secondNumber = stdin.nextInt();
        
        if (firstNumber < 0 || secondNumber < 0) {
            System.out.println("!error...Input Mismatch!!");
        }
        System.out.println("Your numbers are " + firstNumber + " and " + secondNumber);
    }
    


}
    
}
