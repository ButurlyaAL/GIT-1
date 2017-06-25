import java.util.Scanner;
import java.util.ArrayList;

public class Sequence {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an integer sequence(If you have finished ,press any letter) : ");
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    while (input.hasNextInt()) {
      sequence.add(input.nextInt());    
    }
    for (int index = 0; index < sequence.size() - 1; index ++) {                 
      if (sequence.get(index + 1) < sequence.get(index)) {
        System.out.println("It is NOT non-decreasing sequence");
        break;
      } else if (index == sequence.size() -2) {
        System.out.println("It is non-decreasing sequence");
      }
    }
  }
}
