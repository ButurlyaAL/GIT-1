/**
 * Checks the type of INTEGER sequence entered by user.
 */
public class Checker {
  private String[] sequence;
  public Checker(String[] array) {
    for(int i = 0; i < array.length; i ++) {
      sequence[i] = array[i];
    }
  }
  /**
   * Returns true if the sequence is non-decreasing.
   * @param sequence is the sequence to be checked.
   * @return true if the sequence is non-decreasing;false otherwise
   */
  public boolean isNonDecreasing() {
    for (int i = 0; i < sequence.length - 1; i ++) {
      if (Integer.valueOf(sequence[i + 1]) < Integer.valueOf(sequence[i])) {
        return false;
      }
    }
    return true;               
  }
}
