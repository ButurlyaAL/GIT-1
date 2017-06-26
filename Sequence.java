import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(If you have finished, please press any letter) : ");
    int check = 0;
    int currentElement = 0;
    int previousElement = 0;
    while (input.hasNextInt()) {
      currentNum = input.nextInt();
      if (currentElement < previousElement && previousElement != 0) {
        check ++;
      }
    previousElement = currentElement;
    }
    if (input.hasNextLine() && check == 0) {
      System.out.println("It is non-decreasing sequence.");
    } else if (input.hasNextLine() && check > 0) {
      System.out.println("it is NOT non-decreasing sequence");
    }
  }
}
