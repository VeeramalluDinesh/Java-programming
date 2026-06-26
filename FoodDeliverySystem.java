import java.util.Scanner;
class FoodMenu {
    String foodName;
    int price;
    FoodMenu(String foodName, int price) {
        this.foodName = foodName;
        this.price = price;
    }

    int calculateBill(int quantity) {
        return price * quantity;
    }
    void displayOrder(int quantity) {
        System.out.println("\n----- ORDER SUMMARY -----");
        System.out.println("Food Item   : " + foodName);
        System.out.println("Price       : " + price);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Bill  : " + calculateBill(quantity));
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== FOOD MENU =====");
        System.out.println("1. Burger - ₹120");
        System.out.println("2. Pizza  - ₹250");
        System.out.println("3. Biryani- ₹200");
        System.out.println("4. Dosa   - ₹80");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        FoodMenu order = null;
        switch (choice) {
            case 1:
                order = new FoodMenu("Burger", 120);
                break;
            case 2:
                order = new FoodMenu("Pizza", 250);
                break;
            case 3:
                order = new FoodMenu("Biryani", 200);
                break;
            case 4:
                order = new FoodMenu("Dosa", 80);
                break;
            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }
        order.displayOrder(quantity);
        sc.close();
    }
}
