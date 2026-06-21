class Product {
    String productName;
    double price;

    void setProduct(String name, double p) {
        productName = name;
        price = p;
    }

    void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        p1.setProduct("Laptop", 55000);
        p2.setProduct("Smartphone", 25000);

        System.out.println("Product 1 Details:");
        p1.displayProduct();
        System.out.println("\nProduct 2 Details:");
        p2.displayProduct();
    }
}
