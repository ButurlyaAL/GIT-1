import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    if (args.length == 0) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):");
      String line = input.nextLine();
      String[] sequence = line.split(" ");
      checking(sequence);
    } else { 
      checking(args);
    }
  }
  public static void checking(String[] numbers) { 
    for (int i = 0; i < numbers.length - 1; i ++) {
      if (Integer.valueOf(numbers[i + 1]) < Integer.valueOf(numbers[i])) {
        System.out.println("It is NOT non-decreasing sequence.");
        return;
      }
    }
    System.out.println("It is non-decreasing sequence.");               
  }
}
