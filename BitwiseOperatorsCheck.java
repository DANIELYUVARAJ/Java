import java.util.Scanner;

public class BitwiseOperatorsCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        if ((number % 5 == 0) & (number % 6 == 0)) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
        

        System.out.println("Bitwise AND of 5 and 6: " + (5 & 6));
        System.out.println("Bitwise OR of 5 and 6: " + (5 | 6));
        System.out.println("Bitwise XOR of 5 and 6: " + (5 ^ 6));
        System.out.println("Bitwise Complement of 5: " + (~5));
        System.out.println("Left Shift (5 << 1): " + (5 << 1));
        System.out.println("Right Shift (6 >> 1): " + (6 >> 1));
        System.out.println("Unsigned Right Shift (-6 >>> 1): " + (-6 >>> 1));
        
        
        scanner.close();
    }
}
