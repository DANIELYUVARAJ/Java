import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        
        Scanner relat = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double a = relat.nextDouble();
        System.out.print("Enter second number: ");
        double b = relat.nextDouble();

        System.out.println("a == b: " + (a == b));  
        System.out.println("a != b: " + (a != b));  
        System.out.println("a > b: " + (a > b));    
        System.out.println("a < b: " + (a < b));    
        System.out.println("a >= b: " + (a >= b));  
        System.out.println("a <= b: " + (a <= b));

        relat.close();
    }    
}