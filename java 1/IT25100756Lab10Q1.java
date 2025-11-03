import java.util.Scanner;

public class IT25100756Lab10Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = sc.nextInt();

        // Assertion to check if the mark is in the valid range (0-100)
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine grade
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Assertion to verify grade assignment
        if (mark >= 75) {
            assert grade == 'A' : "Incorrect Grade Assigned";
        } else if (mark >= 60) {
            assert grade == 'B' : "Incorrect Grade Assigned";
        } else if (mark >= 50) {
            assert grade == 'C' : "Incorrect Grade Assigned";
        } else if (mark >= 40) {
            assert grade == 'D' : "Incorrect Grade Assigned";
        } else {
            assert grade == 'F' : "Incorrect Grade Assigned";
        }

        // Display grade
        System.out.println("The Grade for the Entered mark is: " + grade);
    }
}
