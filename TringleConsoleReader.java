import java.util.Scanner;

public class TringleConsoleReader {
  public String[] getSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of 3 sides of the triangle(using spaces):");
    String line = input.nextLine();
    String[] sequence = line.split(" ");
    return sequence;
  }
} 