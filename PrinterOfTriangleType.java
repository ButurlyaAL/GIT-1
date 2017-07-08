/** 
 * Prints the type of triangle:normal,isosceles and equilateral. 
 */
public class PrinterOfTriangleType {
  /**
   * Prints the type of triangle.
   * @param qualifier is a integer value,which determines what to print.
   */
  public void printTypeOfTriangle(int qualifier) {
    if (qualifier == 0) {
      System.out.println("Triangle is normal.");
    } else if (qualifier == 1) {
      System.out.println("Triangle is isosceles.");
    } else if (qualifier == 2) {
      System.out.println("Triangle is equilateral.");
    }
  }
}
