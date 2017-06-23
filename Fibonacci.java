import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) { 
    System.out.println("Enter an integer : "); 
    Scanner input = new Scanner(System.in);
    int number = input.nextInt(); 
    double number_sqrt_1 = Math.sqrt(number * number * 5 - 4),number_sqrt_2 = Math.sqrt(number * number * 5 + 4);
    if ((number_sqrt_1 % 1 == 0 || number_sqrt_2 % 1 == 0) && number >= 0)  {
      System.out.println("It is non-negative Fibonacci number");
    } else {
      System.out.println("It is not non-negative Fibonacci number");
    }
  } 
}      
