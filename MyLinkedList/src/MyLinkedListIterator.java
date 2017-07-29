import java.util.Iterator;

/**
 * Itetator for MyLinkedList.
 * @param <Type> is the type of elements of the list.
 */
public class MyLinkedListIterator<Type> implements Iterator<Type> {
    private MyLinkedList<Type> list = new MyLinkedList<>();
    public MyLinkedListIterator(MyLinkedList<Type> list) {
      this.list = list;
    }

    /**
     * @return true if the list has more elements;false otherwise.
     */
    @Override
    public boolean hasNext() {
      return list.getHead().next != list.getHead();
    }

    /**
     * Removes element at the top of the list.
     * @return the next element in the iteration.
     */
    @Override
    public Type next() {
        Element<Type> element = list.getHead().next;
        list.removeFirst();
        return element.getValue();
    }
}
