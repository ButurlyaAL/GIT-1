import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(If you have finished, please press any letter) : ");
    boolean check = false;
    int currentElement = 0;
    int previousElement = 0;
    while (input.hasNextInt()) {
      currentNum = input.nextInt();
      if (currentNum < previousNum) {
        check = true;
      }
    previousNum = currentNum;
    }
    if (input.hasNextLine() && check == false) {
		  System.out.println("It is non-decreasing sequence.");
    } else if (input.hasNextLine() && check) {
      System.out.println("it is NOT non-decreasing sequence");
    }
  }
}
