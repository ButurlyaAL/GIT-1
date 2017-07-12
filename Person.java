/**
 * Consists of information about person,
 * checks correctness of entered information.
 */
public class Person {
  private String firstName;
  private String lastName;
  private int age;
  public Person(String[] information) {
    firstName = information[0];
    lastName = information[1];
    age = Integer.valueOf(information[2]);
    verify();
  }
  /**
   * Checks correctness of entered information about person.
   * @throw IllegalArgumentException if firstname or lastname was entered in wrong format.
   * @throw NumberFormatException if age is not positive.
   */
  public void verify() {
    if (isNumber(firstName) || isNumber(lastName)) {
      throw new IllegalArgumentException();
    }
    if (!isPositive(age)) {
      throw new NumberFormatException();
    } 
  }
  /**
   * Checks whether the entered string is a number.
   * @return true if entered string is a number;false otherwise.
   */
  public boolean isNumber(String word) {
    try {
      int a = Integer.valueOf(word);
    } catch (Exception a) {
     return false;
    }
    return true;
  }
  /**
   * Checks age is positive or not.
   * @return true if age is positive;false otherwise.
   */
  public boolean isPositive(int age) {
    if (age < 0) {
      return false;
    } else {
      return true;
    }
  }
  /**
   * @return firstName.
   */
  public String getFirstName() {
    return firstName;
  }
  /**
   * @return lastName.
   */
  public String getLastName() {
    return lastName;
  }
  /**
   * @return age.
   */
  public int getAge() {
    return age;
  }
}