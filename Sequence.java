import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    if(args.length == 0) {
      consoleInput();  
    } else { 
      int i = 0; 
      while (i < args.length - 1) {
        if (Integer.valueOf(args[i + 1]) < Integer.valueOf(args[i])) {
          System.out.println("It is NOT non-decreasing sequence.");
          return;
        }
        i++;
      }
      System.out.println("It is non-decreasing sequence.");               
    }
  }
  public static void consoleInput() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):");
    int currentElement = 0;
    int previousElement = 0;
    try {
      previousElement = input.nextInt();
    } catch (Exception e) {
      System.out.println("It's NOT integer value. Please try again.");
      return;
    }
    while (input.hasNextInt()) {
      currentElement = input.nextInt();
      if (currentElement < previousElement) {
        System.out.println("It is NOT non-decreasing sequence.");
        return;
      } else {
        previousElement = currentElement;
      }
    }
    System.out.println("It is non-decreasing sequence.");
  }
}  
   
     
     
           
      