import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user score: ");
        int userScore = sc.nextInt();

        System.out.print("Enter maximum score: ");
        int maxScore = sc.nextInt();

        double percentage = (double) userScore / maxScore * 100;

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
