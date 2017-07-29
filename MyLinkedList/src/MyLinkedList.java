/**
 * My implementation of LinkedList.
 * @param <Type> is the type of stored items.
 */
public class MyLinkedList<Type> implements Iterable<Type> {
  private Element<Type> head;
  private int count;

  /**
   * Makes an instance of MyLinkedList.
   * Initialization of class fields.
   */
  public MyLinkedList() {
    head = new Element<>();
    count = 0;
  }

  /**
   * @return head of the list.
   */
  public Element getHead() {
    return head;
  }

  /**
   * @return the number of elements of the list.
   */
  public int getCount() {
    return count;
  }

  /**
   * Adds element to the end of the list.
   * @param value is the value of the added element.
   */
  public void addLast(Type value) {
    Element<Type> element = new Element<>(value);
    if (head.next == head) {
      head.next = element;
      head.previous = element;
      element.previous = head;
      element.next = head;

    } else {
      element.next = head;
      element.previous = head.previous;
      element.previous.next = element;
      head.previous = element;
    }
    count++;
  }

  /**
   * Adds element to the top of the list.
   * @param value is the value of the added element.
   */
  public void addFirst(Type value) {
    Element element = new Element(value);
    if (head.next == head) {
      head.next = element;
      head.previous = element;
      element.previous = head;
      element.next = head;
    } else {
      element.next = head.next;
      element.previous = head;
      element.next.previous = element;
      head.next = element;
    }
    count++;
  }

  private Element search(Type value) {
    Element element = head.next;
    while (element != head) {
      if (element.getValue() == value) {
        return element;
      } else {
        element = element.next;
      }
    }
    throw new IllegalArgumentException("Such element doesn't exists.");
  }

  private void remove(Element element) {
    if (head.next == head) {
      throw new NullPointerException("The list is empty.");
    } else {
      element.previous.next = element.next;
      element.next.previous = element.previous;
      element.next = null;
      element.previous = null;
      count--;
    }
  }

  /**
   * Removes element from the top of the list.
   * @throws NullPointerException if the list is empty.
   */
  public void removeFirst() {
    this.remove(head.next);
  }

  /**
   * Removes an element with specified value.
   * @throws NullPointerException if the list is empty.
   * @param value is the value of removed element.
   */
  public void remove(Type value) {
    this.remove(this.search(value));
  }

  /**
   * Removes element from the end of list.
   * @throws NullPointerException if the list is empty.
   */
  public void removeLast() {
    this.remove(head.previous);
  }

  /**
   * Removes all elements from the list.
   */
  public void clear() {
    head.next = head;
    head.previous = head;
    count = 0;
  }

  /**
   * Returns an iterator over elements of type {@code Type}.
   * @return an MyLinkedListIterator.
   */
  @Override
  public MyLinkedListIterator<Type> iterator() {
    return new MyLinkedListIterator<Type>(this);
  }
}
