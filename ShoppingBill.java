import java.util.Scanner;
class Product {
    private String productName;
    private double price;
    private int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateBill() {
        return price * quantity;
    }
    public void displayBill() {
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Bill   : " + calculateBill());
    }
}

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        Product p = new Product(name, price, quantity);
        p.displayBill();
        sc.close();
    }
}
