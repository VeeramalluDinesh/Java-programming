import java.util.Scanner;
public class DailyTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temperature = new int[7];
        int total = 0;
        System.out.println("Enter temperatures for 7 days:");
        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperature[i] = sc.nextInt();
            total += temperature[i];
        }
        System.out.println("\nDaily Temperatures:");
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperature[i] + "°C");
        }
        double average = (double) total / temperature.length;

        System.out.println("\nTotal Temperature = " + total);
        System.out.println("Average Temperature = " + average + "°C");
        sc.close();
    }
}
