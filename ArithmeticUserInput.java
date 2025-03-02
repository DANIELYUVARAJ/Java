import java.util.Scanner;

public class ArithmeticUserInput {
    public static void main(String[] args) {
        
        Scanner opt = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = opt.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = opt.nextDouble();


        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

    
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division by zero is not allowed!");
        }

    
        opt.close();
    }
}
