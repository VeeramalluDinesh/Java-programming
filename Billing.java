public class Billing {
    public static void main(String[] args) {

        int items = 100;
        float costPerItem = 93.88f;
        float totalCost = items * costPerItem;
        char currency = '₹';

        System.out.println("Billing Calculation");
        System.out.println("Total cost = " + totalCost + currency);
    }
}
