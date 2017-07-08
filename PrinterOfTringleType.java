public class PrinterOfTringleType {
  public void printTypeOfTringle(int n) {
    if(n == 0) {
      System.out.println("Tringle is normal.");
    } else if (n == 1) {
      System.out.println("Tringle is isosceles.");
    } else if (n == 2) {
      System.out.println("Tringle is equilateral.");
    }
  }
}