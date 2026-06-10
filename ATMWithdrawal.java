import java.util.Scanner;
public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;
        System.out.println("=== ATM Withdrawal System ===");
        System.out.println("Current Balance: ₹" + balance);
        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance = balance - amount;
           System.out.println("Withdrawal Successful!");
            System.out.println("Amount Withdrawn: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
        sc.close();
    }
}
