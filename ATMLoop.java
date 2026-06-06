import java.util.Scanner;
public class ATMLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int enteredPin;
        int attempts = 0;
        // Do-While Loop
        do {
            System.out.print("Enter ATM PIN: ");
            enteredPin = sc.nextInt();
            attempts++;
            if (enteredPin == correctPin) {
                System.out.println("PIN Verified Successfully!");
                break;
            } else {
                System.out.println("Incorrect PIN. Try Again.");
            }
        } while (attempts < 3);

        // While Loop
        while (enteredPin == correctPin) {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your Balance is ₹10,000");
            } else if (choice == 2) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else {
                System.out.println("Invalid Choice.");
            }
        }
        sc.close();
    }
}
