import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer : "); 
    int number = input.nextInt(); 
    double firstNumberSqrt = Math.sqrt(number * number * 5 - 4);
    double secondNumberSqrt = Math.sqrt(number * number * 5 + 4);
    if ((firstNumberSqrt % 1 == 0 || secondNumberSqrt % 1 == 0) && number >= 0) {
      System.out.println("It is non-negative Fibonacci number");
    } else {
      System.out.println("It is not non-negative Fibonacci number");
    }
  } 
}      
