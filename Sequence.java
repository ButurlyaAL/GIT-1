import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished, please press ENTER and any letter)) : ");
    int currentElement = 0;
    int previousElement = 0;
    while (input.hasNextInt()) {
      currentElement = input.nextInt();
      if (currentElement < previousElement && previousElement != 0) {
        Sysem.out.println("It is NOT non-decreasing sequence.");
        return;
      } else {
        previousElement = currentElement;
      }
    }
    System.out.println("It is non-decreasing sequence.");
  }
}
