/**
 * Displays a list of information about persons.
 */
public class EntryClass {
  public static void main(String[] args) { 
  Reader reader = new Reader();
  try {
      for (Person person : reader.getListOfPersons()) {
        System.out.printf("Firstname:%s  Lastname:%s  Age:%d  \n", person.getFirstName(), person.getLastName(), person.getAge());
      }
    } catch (NumberFormatException firstException) {
      firstException.getMessage();
    } catch (IllegalArgumentException secondException) {
      secondException.getMessage();
    } catch (ArrayIndexOutOfBoundsException c) {
      System.out.println("You did not complete all the fields about some persons.Start programm again.");
    }
  }
}
