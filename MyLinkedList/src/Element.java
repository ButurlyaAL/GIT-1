/**
 * Class which decribes elemets of MyLinkedList.
 * @param <Type> is the type of the element.
 */
public class Element<Type> {
  private Type value;
  public Element next;
  public Element previous;

  /**
   * Makes an empty instance of Element.
   */
  public Element() {
    next = this;
    previous = this;
    this.value = null;
  }

  /**
   * Makes an instance of Element with value.
   */
  public Element(Type value) {
    next = this;
    previous = this;
    this.value = value;
  }

  /**
   * @return the value of the element.
   */
  public Type getValue() {
    return value;
  }
}
