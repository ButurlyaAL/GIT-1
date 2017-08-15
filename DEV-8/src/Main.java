/**
 * Entry point.
 */
public class Main {

  public static void main(String[] args) {
    DataBase dataBase = new DataBase();
    DataProvider dataProvider = new DataProvider();
    dataProvider.enterDataTo(dataBase);
    Menu menu = new Menu(new CommandBuilder(dataBase));
    menu.run();
  }
}
