/**
 * Checks the type of INTEGER sequence entered by user.
 */
public class Checker {
  private boolean result;
  public Checker(String[] sequence) {
    result = checkForNondecreasing(sequence);
  }
  /**
   * Returns true if the sequence is non-decreasing.
   * @param sequence is the sequence to be checked.
   * @return true if the sequence is non-decreasing;false if sequence is non-decreasing.
   */
  public boolean checkForNondecreasing(String[] sequence) {
    for (int i = 0; i < sequence.length - 1; i ++) {
      if (Integer.valueOf(sequence[i + 1]) < Integer.valueOf(sequence[i])) {
        return false;
      }
    }
    return true;               
  }
  /**
   * @return result of check for nondecreasing.
   */
  public boolean getResult() {
    return result;
  }
}
