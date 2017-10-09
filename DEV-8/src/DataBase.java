import java.util.LinkedList;
import java.util.HashMap;

/**
 * Representation of data base.
 */
public class DataBase {
  private HashMap<String, LinkedList<Product>> data;

  /**
   * Makes data base :HashMap with LinkedLists.
   */
  public DataBase() {
    data = new HashMap<>();
  }

  /**
   * Makes LinkedList for each new type .
   * Adds new product with certain type in list,wich made for this type.
   * @param product wich added to data base
   */
  public void add(Product product) {
    if (data.containsKey(product.getType())) {
      data.get(product.getType()).add(product);
    } else {
      LinkedList<Product> list = new LinkedList<>();
      list.add(product);
      data.put(product.getType(), list);
    }
  }

  public HashMap<String, LinkedList<Product>> getAllData() {
    return data;
  }

  /**
   * @param type of products.
   * @return list of products with the type.
   */
  public LinkedList<Product> getDataAboutType(String type) {
    return data.get(type);
  }
}
