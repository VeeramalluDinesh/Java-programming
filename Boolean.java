public class Boolean {
    public static void main(String[] args) {

        String name = "Raghavi";
        int age = 20;
        int marks = 85;
        boolean isAdult = age >= 18;
        boolean hasPassed = marks >= 35;
        boolean isExcellent = marks >= 75;

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        System.out.println("\nBoolean Results");
        System.out.println("----------------");
        System.out.println("Is Adult? " + isAdult);
        System.out.println("Has Passed? " + hasPassed);
        System.out.println("Excellent Performance? " + isExcellent);

        if (isAdult) {
            System.out.println("\nYou are eligible to vote.");
        }

        if (hasPassed) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }

        if (isExcellent) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: B or below");
        }
    }
}
