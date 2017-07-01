import java.util.Scanner;

public class ConsoleReader {
  private Scanner input;
  private String line;
  public ConsoleReader() {
    input = new Scanner(System.in);
    System.out.println("Enter an INTEGER sequence(use spaces(If you have finished,press ENTER)):"); 
  }
  public String[] reading() {
    line = input.nextLine();
    String[] sequence = line.split(" ");
    return sequence;
  }
}
  