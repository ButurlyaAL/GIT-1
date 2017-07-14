/**
 * Makes list with information about persons.
 */
public class EntryClass {
  public static void main(String[] args) { 
  Reader reader = new Reader();
  try {
      for (Person person : reader.getListOfPersons()) {
        System.out.printf("Firstname:%s  Lastname:%s  Age:%d  \n", person.getFirstName(), person.getLastName(), person.getAge());
      }
    } catch (NumberFormatException a) {
      System.out.println("You have entered age in wrong format(Age must be POSITIVE and INTEGER).Start programm again.");
    } catch (IllegalArgumentException b) {
      System.out.println("You have entered firstName or lastName as NUMBER.Please Start programm again.");
    } catch (ArrayIndexOutOfBoundsException c) {
      System.out.println("You did not complete all the fields about some persons.Start programm again.");
    }
  }
}
