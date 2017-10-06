import java.util.Iterator;

/**
 * Itetator for MyLinkedList.
 * @param <Type> is the type of elements of the list.
 */
public class MyLinkedListIterator<Type> implements Iterator<Type> {
  private MyLinkedList<Type> list;
  private Element<Type> element;
  public MyLinkedListIterator(MyLinkedList<Type> list) {
    this.list = list;
    element = null;
  }

  /**
   * @return true if the list iteration has more elements;false otherwise.
   */
  @Override
  public boolean hasNext() {
    return element == null || element.next != list.getHead();
  }
  
  /**
   * @return the next element in the iteration.
   */
  @Override
  public Type next() {
    if (element == null) {
      element = list.getHead().next;
    } else {
      element = element.next;
    }
    return element.getValue();
  }
}
