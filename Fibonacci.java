import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) { 
    System.out.println("Enter an integer : ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    while(number < 0) {
      System.out.println("Wrong!!!(Your number is negative)Try again :");
      number = input.nextInt();
    }
    int n = 100;
    int iteration = 0;
    int currentCount = 0;
    int nextCount = 1;
    while(iteration < n) {
      if(currentCount == number) {
        System.out.println("It is non-negative Fibonacci number");
        break;
      }
      nextCount += currentCount;
      currentCount = nextCount - currentCount;
     

      if(iteration == n - 1 && currentCount != number) {
        System.out.println("It is not non-negative Fibonacci number");
      }
      iteration ++;
    }       
  } 
}            
