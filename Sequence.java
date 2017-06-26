import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished, please press ENTER)) : ");
    int currentNum = 0;
    int previousNum = 0;
    String result = "";
    while (input.hasNextInt()) {
    currentNum = input.nextInt();
    if (currentElement < previousElement && previousElement != 0) {
      result = "It is NOT non-decreasing sequence.";
      break;
    } else {
      previousElement = currentElement;
    }
    if (input.hasNextLine()) 
      result = "It is non-decreasing sequence.";
    }
  }
  System.out.println(result);
}
