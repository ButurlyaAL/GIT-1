
 /** Print the type of sequence:non decreasing or not. */
public class Sequence {
  public static void main(String[] args) {
    Checker checker = new Checker();
    /** A boolean value thats determines the type of sequence:non-decreasing or not. */
    boolean check;
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      check = checker.checking(consoleReader.reading());
    } else { 
      check = checker.checking(args);  
    }
    if (check) {
    System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
} 
