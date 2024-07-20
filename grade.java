package com.anudip;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many grades do you want to enter? ");
        int numGrades = input.nextInt();
        int sum = 0;
        int validGrades = 0;

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            if (input.hasNextInt()) {
                int grade = input.nextInt();
                if (grade >= 0 && grade <= 100) {
                    sum += grade;
                    validGrades++;
                } else {
                    System.out.println("Invalid grade entered. Grade must be between 0 and 100.");
                    i--;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid grade.");
                input.next(); // clear the invalid input
                i--;
            }
        }

        if (validGrades > 0) {
            double average = (double) sum / validGrades;
            System.out.println("The average of the " + validGrades + " valid grades is: " + average);
        } else {
            System.out.println("No valid grades entered to calculate the average.");
        }

        input.close();
    }
}


