/** 
 * Prints the type of tringle:normal,isosceles and equilateral. 
 */
public class PrinterOfTringleType {
  /**
   * Prints the type of tringle.
   * @param qualifier is a integer value,which determines what to print.
   */
  public void printTypeOfTringle(int qualifier) {
    if(qualifier == 0) {
      System.out.println("Tringle is normal.");
    } else if (qualifier == 1) {
      System.out.println("Tringle is isosceles.");
    } else if (qualifier == 2) {
      System.out.println("Tringle is equilateral.");
    }
  }
}
