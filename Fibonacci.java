import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) { 
    System.out.println("Enter an integer : ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    while(number < 0) {
      /*if the number is negative
        request to enter again*/ 
      System.out.println("Wrong!!!(Your number is negative)Try again :");
      number = input.nextInt();
    }
    int n = 100;
    int iteration = 0;
    int currentCount = 0;
    int nextCount = 1;
    while(iteration < n) {
      if(currentCount == number) {
        /*if we have concidence:
          it is Fibonacci number*/
        System.out.println("It is non-negative Fibonacci number");
        break;
      }
      //calculation
      nextCount += currentCount;
      currentCount = nextCount - currentCount;
     

      if(iteration == n - 1 && currentCount != number) {
        /*if we have reached the end of the cicle and there is no coincidence
          decide that the number entered is not a Fibonacci number*/
        System.out.println("It is not non-negative Fibonacci number");
      }
      iteration ++;
    }       
  } 
}            
