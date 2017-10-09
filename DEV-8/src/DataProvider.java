import java.util.Scanner;

/**
 * Provides data from user.
 */
public class DataProvider {
  /**
   * Putting data(enetered by user) in data base,until user entering data .
   * @param dataBase in wich data is putting.
   */
  public void enterDataTo(DataBase dataBase) {
    ProductBuilder productBuilder = new ProductBuilder();
    do {
      dataBase.add(productBuilder.build());
    } while (requestForInput());
  }

  private boolean requestForInput() {
    System.out.println("If you want to enter information for one more product press YES,otherwise press ENTER.");
    switch (new Scanner(System.in).nextLine()) {
      case "YES":
        return true;
      default:
        return false;
    }
  }
}
