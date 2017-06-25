import java.util.Scanner;
import java.util.ArrayList;

public class Sequence {
  public static void main(String[] args) { 
    System.out.println("Enter an integer sequence(If you have finished ,press any letter) : ");
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);
    while (true) {
      if (input.hasNextInt() == false) {
        break;
      }
      sequence.add(input.nextInt());    
    }
    for (int element = 0; element < sequence.size() - 1; element ++) {                 
      if (sequence.get(element + 1) < sequence.get(element)) {
        System.out.println("It is not non-decreasing sequence");
        break;
      } else if (element == sequence.size() -2) {
        System.out.println("It is non-decreasing sequence");
      }
    }
  }
}
