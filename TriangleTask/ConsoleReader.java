import java.util.Scanner;

/**
 * Read values of the sides from the console.
 */
public class ConsoleReader {
   /**
   * Returns String array,
   * which consists of the numbers(in the string representation) entered by the user.
   * @return string representation of sides entered by the user.
   */
  public String[] readSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sides of the triangle using spaces(If you have finished,press ENTER):");
    return input.nextLine().split(" ");
  } 
}
