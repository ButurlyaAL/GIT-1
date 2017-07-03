/**
 *Checks the type of any sequence.
 */
public class Checker {
/**
 *Returns a boolean value,
 *which determines that the sequence is non-decreasing or not.
 *@param sequence is the sequence to be checked
 *@return boolean result of check
 */
  public boolean check(String[] sequence) {
    for (int i = 0; i < sequence.length - 1; i ++) {
      if (Integer.valueOf(sequence[i + 1]) < Integer.valueOf(sequence[i])) {
        return true;
      }
    }
    return false;               
  }
}    
