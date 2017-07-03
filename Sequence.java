/** 
 *Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Checker checker = new Checker();
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      printResultOfCheck(checker.check(consoleReader.getSequence()));
    } else { 
      printResultOfCheck(checker.check(args));  
    }
  }
}
