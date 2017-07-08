import java.util.Scanner;

/**
 * Read the sequence of values for the sides of the triangle.
 */
public class TriangleConsoleReader {
  /**
   * Returns String array,
   * which consists of the numbers(in the string representation) entered by the user.
   * @return String array
   */
  public String[] getSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of 3 sides of the triangle(using spaces):");
    String line = input.nextLine();
    String[] sequence = line.split(" ");
    return sequence;
  }
} 
