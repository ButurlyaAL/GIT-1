import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AveragePriceCommandTest {
  @Test
  public void execute() throws Exception {
    DataBase dataBase = new DataBase();
    dataBase.add(new Product("firstType", "firstName", 2, new BigDecimal("3.2")));
    dataBase.add(new Product("firstType", "secondName", 3, new BigDecimal("1.2")));
    dataBase.add(new Product("secondType", "name", 1, new BigDecimal("1.0")));
    dataBase.add(new Product("thirdType", "name", 4, new BigDecimal("3.0")));
    assertTrue(new BigDecimal("2.1").compareTo(new AveragePriceCommand(dataBase).averagePrice()) == 0);

  }

}