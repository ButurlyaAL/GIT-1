import java.util.Scanner;

/**
 * Read a sequence from the console.
 */
public class ConsoleReader {
  /**
   * Returns String array,
   * which consists of the numbers(in the string representation) entered by the user.
   * @return String array.
   */
  public String[] readSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):");
    return input.nextLine().split(" ");
  } 
}  
