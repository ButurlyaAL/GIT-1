import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    if (args.length != 0) { 
      printResultOfCheck(check(args));
    } else {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):");
      String line = input.nextLine();
      String[] sequence = line.split(" ");
      printResultOfCheck(check(sequence));   
    }
  }
/**
 *Returns a boolean value,
 *which determines that the sequence is non-decreasing or not.
 *@param numbers is the sequence to be checked
 *@return a boolean value
 */
  public static boolean check(String[] numbers) { 
    for (int i = 0; i < numbers.length - 1; i ++) {
      if (Integer.valueOf(numbers[i + 1]) < Integer.valueOf(numbers[i])) {
        return true;
      }
    }
    return false;               
  }
 /**
  *Prints what sequence is.
  *@param resultOfCheck is a boolean value,which is the result of verification of sequence.
  */
  public static void printResultOfCheck(boolean resultOfCheck) {
     if (resultOfCheck) {
       System.out.println("It is NOT non-decreasing sequence.");
     } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
}
