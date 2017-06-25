import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer sequence(without blancs : ");
    String sequence = input.nextLine();
    int currentElement;
    int nextElement;
    for (int index = 0; index < sequence.length() - 1; index++) {
      currentElement = Integer.valueOf(sequence.charAt(index));
      nextElement = Integer.valueOf(sequence.charAt(index + 1));
      if (nextElement < currentElement) {
        System.out.println("It is NOT non-decreasung sequence");
        break;
      } else if (index == sequence.length() - 2) {
        System.out.println("It is non-decreasung sequence");
      }     
    }  
  }
}
