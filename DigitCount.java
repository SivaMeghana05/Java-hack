import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Read an integer from the user
        int number = scanner.nextInt();
        scanner.close();
        
        // Convert the integer to a string
        String numberStr = String.valueOf(number);
        
        // Count the number of digits
        int digitCount = numberStr.length();
        
        System.out.println("Number of digits in the integer: " + digitCount);
    }
}
