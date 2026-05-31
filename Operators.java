import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > b) : " + !(a > b));

        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        c += b;
        System.out.println("c += b : " + c);

        c = a;
        c -= b;
        System.out.println("c -= b : " + c);

        c = a;
        c *= b;
        System.out.println("c *= b : " + c);

        // Increment and Decrement Operators
        System.out.println("\n--- Increment/Decrement Operators ---");
        int x = a;
        System.out.println("x++ : " + (x++));
        System.out.println("After x++ : " + x);

        System.out.println("++x : " + (++x));

        System.out.println("x-- : " + (x--));
        System.out.println("After x-- : " + x);

        sc.close();
    }
}
