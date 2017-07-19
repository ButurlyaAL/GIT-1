/**
 * Consists of information about person,
 * checks correctness of entered information.
 */
public class Person {
  private String firstName;
  private String lastName;
  private int age;
  /**
   * Makes an exemplar of Person if all the fields are correct.
   */
  public Person(String[] information) {
    firstName = information[0];
    lastName = information[1];
    age = Integer.valueOf(information[2]);
    verify();
  }
  private void verify() {
    if (namesIsNumber()) {
      throw new IllegalArgumentException("Wrong firstname or lastname");
    }
    if (!ageIsPositive()) {
      throw new NumberFormatException("Age isn't positive.");
    } 
  }
  private boolean namesIsNumber() {
    try {
      int number = Integer.valueOf(firstName);
      number = Integer.valueOf(lastName);
    } catch (Exception b) {
     return false;
    }
    return true;
  }
  private boolean ageIsPositive() {
   return age >= 0;
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
