import java.util.Scanner;

public class AssignmentOperatorsWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter an integer value: ");
        int a = scanner.nextInt();

        System.out.println("\nInitial value of a: " + a);

        
        System.out.print("Enter a number to add to a: ");
        int add = scanner.nextInt();
        a += add; 
        System.out.println("After a += " + add + ": " + a);

        System.out.print("Enter a number to subtract from a: ");
        int sub = scanner.nextInt();
        a -= sub; 
        System.out.println("After a -= " + sub + ": " + a);

        System.out.print("Enter a number to multiply a by: ");
        int mul = scanner.nextInt();
        a *= mul; 
        System.out.println("After a *= " + mul + ": " + a);

        System.out.print("Enter a number to divide a by: ");
        int div = scanner.nextInt();
        if (div != 0) {
            a /= div; 
            System.out.println("After a /= " + div + ": " + a);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        System.out.print("Enter a number to find modulus with a: ");
        int mod = scanner.nextInt();
        if (mod != 0) {
            a %= mod; 
            System.out.println("After a %= " + mod + ": " + a);
        } else {
            System.out.println("Cannot perform modulus with zero!");
        }

        scanner.close();
    }
}
