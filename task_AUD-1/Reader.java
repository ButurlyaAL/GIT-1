import java.util.Scanner;
import java.util.LinkedList;

/**
 * Reads information about persons entered by user from console.
 */
public class Reader {
  private Scanner input;
  /**
   * Reads information about persons.
   * @return LinkedList, which consists of information about persons.
   */
  public LinkedList<Person> getListOfPersons() {
    input = new Scanner(System.in);
    LinkedList<Person> persons = new LinkedList<>();
    do {
      System.out.println("Enter information(firstname,lastname and age) about person(use spaces) :");
      persons.add(new Person(input.nextLine().split(" ")));  
    } while (requestForInput());
    return persons;
  }
  
  /**
   * Asks the user if he wants to enter information for one more person.
   * @return true if user press "YES";false if user press "NO" or anything else.
   */
  public boolean requestForInput() {
    System.out.println("If you want to enter information for one more person press YES,otherwise press NO."); 
    switch (input.nextLine()) {
      case "YES":
        return true;
      case "NO":
        return false;
    }
    return false;
  } 
}
