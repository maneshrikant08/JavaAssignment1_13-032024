/*1)Write a program that takes a numerical grade as input and outputs the corresponding letter
grade using if-else statements.
*/

import java.util.Scanner;

class Assi1_q1{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the numerical grade: ");
    int grade = scanner.nextInt();

    String letterGrade;
    if (grade >= 90 && grade <= 100) {
        letterGrade = "A";
    } else if (grade >= 80 && grade < 90) {
        letterGrade = "B";
    } else if (grade >= 70 && grade < 80) {
        letterGrade = "C";
    } else if (grade >= 60 && grade < 70) {
        letterGrade = "D";
    } else if (grade < 60 && grade >= 0) {
        letterGrade = "F";
    } else {
        letterGrade = "Invalid grade";
    }

    System.out.println("The corresponding letter grade is: " + letterGrade);
    scanner.close();
   
    }
  }
