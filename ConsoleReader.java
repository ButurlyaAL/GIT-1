import java.util.Scanner;
/**
 *Read a sequence from the console.
 */
public class ConsoleReader {
  private Scanner input;
  private String line;
  /**
   *Class constructor
   */
  public ConsoleReader() {
    input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):"); 
  }
  /**
   *returns String array,
   *which consists of the numbers(in the string representation) entered by the user
   *@return String array
   */
  public String[] reading() {
    line = input.nextLine();
    String[] sequence = line.split(" ");
    return sequence;
  }
}  
