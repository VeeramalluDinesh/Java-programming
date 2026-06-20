import java.util.Scanner;
class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    public String getGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 35) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();
        s.setMarks(marks);
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.getGrade());
        sc.close();
    }
}
