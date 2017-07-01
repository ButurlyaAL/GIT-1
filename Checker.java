/**
 *Checks the type of any sequence.
 */
public class Checker {
  /**
   *returns a boolean value,
   *which determines that the sequence is non-decreasing or not.
   *@numbers is the sequence to be checked
   *@return a boolean value
   */
  public boolean checking(String[] sequence) {
    for (int i = 0; i < sequence.length - 1; i ++) {
      if (Integer.valueOf(sequence[i + 1]) < Integer.valueOf(sequence[i])) {
        return true;
      }
    }
    return false;               
  }
}    
