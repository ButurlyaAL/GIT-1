import java.math.BigDecimal;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class DataBaseTest {
  @org.junit.Test
  public void addToEmptyDataBase() throws Exception {
    DataBase dataBase = new DataBase();
    dataBase.add(new Product("secondType", "name", 1, new BigDecimal("1.0")));
    assertFalse(dataBase.getAllData().isEmpty());
  }

  @org.junit.Test
  public void testAddForCreateListForNewType() {
    DataBase dataBase = new DataBase();
    LinkedList<Product> firstlist = new LinkedList();
    LinkedList<Product> secondlist = new LinkedList();
    Product firstProduct = new Product("firstType", "name", 1, new BigDecimal("1.0"));
    Product secondProduct = new Product("secondType", "name", 1, new BigDecimal("1.0"));
    dataBase.add(firstProduct);
    dataBase.add(secondProduct);
    firstlist.add(firstProduct);
    secondlist.add(secondProduct);
    assertEquals(firstlist, dataBase.getDataAboutType("firstType"));
    assertEquals(secondlist, dataBase.getDataAboutType("secondType"));
  }

  @org.junit.Test
  public void testAddToCorrectList() {
    DataBase dataBase = new DataBase();
    Product product = new Product("type", "name", 1, new BigDecimal("1.0"));
    dataBase.add(new Product("firstType", "firstName", 1, new BigDecimal("1.0")));
    dataBase.add(new Product("secondType", "name", 1, new BigDecimal("3.0")));
    dataBase.add(new Product("firstType", "secondName", 1, new BigDecimal("199.9")));
    LinkedList<Product> list = new LinkedList();
    list.add(new Product("firstType", "firstName", 1, new BigDecimal("1.0")));
    list.add(new Product("firstType", "secondName", 1, new BigDecimal("199.9")));
    assertEquals(list, dataBase.getDataAboutType("firstType"));
  }
}