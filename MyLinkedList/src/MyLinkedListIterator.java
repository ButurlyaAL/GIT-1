import java.util.Iterator;

/**
 * Itetator for MyLinkedList.
 * @param <Type> is the type of elements of the list.
 */
public class MyLinkedListIterator<Type> implements Iterator<Type> {
  private MyLinkedList<Type> list;
  private Element<Type> element;
  private int count;
  public MyLinkedListIterator(MyLinkedList<Type> list) {
    this.list = list;
    element = list.getHead().next;
    count = 0;
  }

  /**
   * @return true if the list iteration has more elements;false otherwise.
   */
  @Override
  public boolean hasNext() {
    return count < list.getSize();
  }
  
  /**
   * @return the next element in the iteration.
   */
  @Override
  public Type next() {
    if (count > 0) {
      element = element.next;
    }
    count ++;
    return element.getValue();
  }
}
