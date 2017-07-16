import java.util.Scanner;
  
public class ConsoleReader {
  public String[] readSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sides of the triangle using spaces(If you have finished,press ENTER):");
    return input.nextLine().split(" ");
  } 
}