import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    boolean a;
    if (args.length == 0) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):");
      String line = input.nextLine();
      String[] sequence = line.split(" ");
      a = checking(sequence);
    } else { 
      a = checking(args);  
    }
    if (a) {
    System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
  }
  public static boolean checking(String[] numbers) { 
    for (int i = 0; i < numbers.length - 1; i ++) {
      if (Integer.valueOf(numbers[i + 1]) < Integer.valueOf(numbers[i])) {
        return true;
      }
    }
    return false;               
  }
}
