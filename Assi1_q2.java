/*Q2.Write a program that checks if a given year is a leap year or not using both if-else and
switch-case. */

import java.util.Scanner;

public class Assi1_q2 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int year=in.nextInt();
    if (year % 4 == 0) {
      if (year % 100 == 0) {
          if (year % 400 == 0) {
              System.out.println(year + " is a leap year");
          } else {
              System.out.println(year + " is not a leap year");
          }
      } else {
          System.out.println(year + " is a leap year");
      }
  } else {
      System.out.println(year + " is not a leap year");
  }
    
  }
  
}



