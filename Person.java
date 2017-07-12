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
  public void verify() {
    if (isNumber(firstName) || isNumber(lastName)) {
      throw new IllegalArgumentException();
    }
    if (!isPositive(age)) {
      throw new NumberFormatException();
    } 
  }
  public boolean isNumber(String word) {
    try {
      int a = Integer.valueOf(word);
    } catch (Exception a) {
     return false;
    }
    return true;
  }
  public boolean isPositive(int age) {
    if (age < 0) {
      return false;
    } else {
      return true;
    }
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public int getAge() {
    return age;
  }
}