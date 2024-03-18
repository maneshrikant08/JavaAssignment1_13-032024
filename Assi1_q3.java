/*Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
input and performs the operation using switch-case. */

import java.util.Scanner;

public class Assi1_q3 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num1=in.nextInt();
    int num2=in.nextInt();
    char op=in.next().charAt(0);
    switch (op) {
      case '+':
      System.out.println("Result: "+(num1 + num2));
      break;
      case '-':
      System.out.println("Result: "+(num1 - num2));
      break;
      case '*':
      System.out.println("Result: "+(num1 * num2));
      break;
      case '/':
      System.out.println("Result: "+(num1 / num2));
      break;
    
      default:
        break;
    }
  }

  
}
