import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Hello and welcome to Student Calculator!");
        System.out.println("Enter the no. of subjects ");
        int s = in.nextInt();
        System.out.println("Enter the student name ");
        String name = in.next();
        for (int i = 1; i <= s; i++) {
            System.out.println("Enter the subject name");
            String b = in.next();
            System.out.println("Enter the marks out of 100");
            int m = in.nextInt();

            // Validate marks entered
            if (m < 0 || m > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                continue;
            }

            // Calculate grade for each subject
            if (m >= 91) {
                System.out.println("the subject grade=A+");
            } else if (m >= 81) {
                System.out.println("the subject grade=A");
            } else if (m >= 71) {
                System.out.println("the subject grade=B+");
            } else if (m >= 61) {
                System.out.println("the subject grade=B");
            } else if (m >= 51) {
                System.out.println("the subject grade=C+");
            } else if (m >= 41) {
                System.out.println("the subject grade=C");
            } else if (m >= 33) {
                System.out.println("the subject grade=D");
            } else {
                System.out.println("the subject grade=F");
            }

            sum += m;
        }

        // Calculate average percentage and grade
        a = (sum / (s * 100)) * 100;
        char grade;
        if (a >= 91) {
            grade = 'A';
        } else if (a >= 81) {
            grade = 'B';
        } else if (a >= 71) {
            grade = 'C';
        } else if (a >= 61) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println(name);
        System.out.println("The total marks are " + sum);
        System.out.println("The average percentage is " + a);
        System.out.println("Grade=" + grade);


    }
}
