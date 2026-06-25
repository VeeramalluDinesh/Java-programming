import java.util.Scanner;
class FoodOrder {
    private String foodName;
    private int quantity;
    private double price;

    FoodOrder(String foodName, int quantity, double price) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateBill() {
        return quantity * price;
    }
    public void displayOrder() {
        System.out.println("\n----- ORDER DETAILS -----");
        System.out.println("Food Item : " + foodName);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Price     : " + price);
        System.out.println("Total Bill: " + calculateBill());
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Name: ");
        String foodName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();
        FoodOrder order = new FoodOrder(foodName, quantity, price);
        order.displayOrder();
        sc.close();
    }
}
