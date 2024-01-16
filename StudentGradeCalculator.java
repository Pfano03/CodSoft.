
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author singo pfano
 */
public class StudentGradeCalculator {

   public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = input.nextInt();

        // Input marks for each subject
        int[] subjectMarks = new int[numOfSubjects];
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            subjectMarks[i] = input.nextInt();
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }

        // Calculate average percentage with at least two decimal places
        double averagePercentage = (double) totalMarks / numOfSubjects;

        // Assign grade based on rounded average percentage
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");

        // Round the average to the nearest whole number and print
        int roundedAverage = (int) Math.round(averagePercentage);
        System.out.println("Final Average: " + roundedAverage + "%");

        System.out.println("Grade: " + grade);
    }

    // Function to calculate grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}