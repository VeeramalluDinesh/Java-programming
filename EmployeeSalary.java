import java.util.Scanner;

class Employee {
    private String name;
    private double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public double calculateNetSalary() {
        double hra = basicSalary * 0.20; // 20% HRA
        double bonus = basicSalary * 0.10; // 10% Bonus
        return basicSalary + hra + bonus;
    }

    public void displayDetails() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(name, salary);
        emp.displayDetails();
        sc.close();
    }
}
