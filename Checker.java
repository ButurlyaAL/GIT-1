/**
 * Checks the type of numerical sequence entered by user.
 */
public class Checker {
  /**
   * Returns true if the sequence is NOT non-decreasing.
   * @param sequence is the sequence to be checked
   * @return true if the sequence is NOT non-decreasing;false otherwise
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
