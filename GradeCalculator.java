import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        int[] marks = new int[subjects];
        int TotalMarks = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.printf("Enter marks obtained in subject %d (out of 100): ", i + 1);
            marks[i] = scanner.nextInt();
            TotalMarks += marks[i];
        }
        float AveragePercentage = (float) TotalMarks / subjects;
        char grade = Grade(AveragePercentage);

        System.out.println("\n Results are as follows: ");
        System.out.println("\nTotal Marks: " + TotalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", AveragePercentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }

    public static char Grade(double AveragePercentage) {
        if (AveragePercentage >= 90) {
            return 'A';
        } else if (AveragePercentage >= 80) {
            return 'B';
        } else if (AveragePercentage >= 70) {
            return 'C';
        } else if (AveragePercentage >= 60) {
            return 'D';
        } else if (AveragePercentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
