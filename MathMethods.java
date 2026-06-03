public class MathMethods {
    public static void main(String[] args) {
        double num1 = 87.55;
        double num2 = 40.08;
        int a = -10;

        System.out.println("=== Java Math Methods ===");

        System.out.println("abs(" + a + ") = " + Math.abs(a));
        System.out.println("sqrt(25.64) = " + Math.sqrt(num1));
        System.out.println("pow(5, 3) = " + Math.pow(num2, 3));
        System.out.println("max(25.64, 5) = " + Math.max(num1, num2));
        System.out.println("min(25.64, 5) = " + Math.min(num1, num2));

        System.out.println("round(25.64) = " + Math.round(num1));
        System.out.println("ceil(25.64) = " + Math.ceil(num1));
        System.out.println("floor(25.64) = " + Math.floor(num1));
        System.out.println("random() = " + Math.random());
        System.out.println("cbrt(125) = " + Math.cbrt(125));
        System.out.println("exp(2) = " + Math.exp(2));

        System.out.println("log(10) = " + Math.log(10));
        System.out.println("log10(100) = " + Math.log10(100));

        // Trigonometric functions
        System.out.println("sin(30°) = " +
                Math.sin(Math.toRadians(30)));
        System.out.println("cos(60°) = " +
                Math.cos(Math.toRadians(60)));
        System.out.println("tan(45°) = " +
                Math.tan(Math.toRadians(45)));

        System.out.println("toDegrees(PI) = " +
                Math.toDegrees(Math.PI));
        System.out.println("toRadians(180) = " +
                Math.toRadians(180));

        System.out.println("Value of PI = " + Math.PI);
        System.out.println("Value of E = " + Math.E);
    }
}
