import java.util.Scanner;

/**
 * Makes list with information about persons.
 */
public class EntryClass {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of persons :");
    try {
      int number = input.nextInt();
      Person[] persons = new Person[number]; 
      for(int i = 0; i < number; i ++) {
        input = new Scanner(System.in);
        System.out.println("Enter information(firstname,lastname and age) about person(use spaces) :");
        String line = input.nextLine();
        String[] information = line.split(" ");
        Person person = new Person(information);
        persons[i] = person;
      }
      for (int j = 0; j < number; j ++) {
        System.out.printf("Firstname: %s  Lastname: %s  Age: %d  \n", persons[j].getFirstName(), persons[j].getLastName(), persons[j].getAge());
      } 
    } catch (NumberFormatException a) {
      System.out.println("You have entered age in wrong format(Age must be POSITIVE and INTEGER.Start programm again.");
    } catch (IllegalArgumentException b) {
      System.out.println("You have entered firstName or lastName as NUMBER.Please Start programm again.");
    } catch (ArrayIndexOutOfBoundsException c) {
      System.out.println("You did not complete all the fields about some persons.Start programm again.");
    }
  }
}
