import java.util.Scanner;
public class BankingSystem{
    static double balance = 5000;
    static Scanner sc = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: ₹" + balance);
                showMenu();  // Recursive Call
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Deposit Successful");
                showMenu();  // Recursive Call
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdrawal Successful");
                } else {
                    System.out.println("Insufficient Balance");
                }

                showMenu();  // Recursive Call
                break;
            case 4:
                System.out.println("Thank You!");
                return;      // Base Case
            default:
                System.out.println("Invalid Choice");
                showMenu();  // Recursive Call
        }
    }
    public static void main(String[] args) {
        showMenu();
    }
}
