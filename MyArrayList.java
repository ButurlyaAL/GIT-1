/**
 * Realisation of a dynamic Array
 */
public class MyArrayList<Type> {
  private Type[] array;
  private int size;
  /**
   * The field that specifies the index of the array element that follows must be filled by ArrayList.add().
   */
  private int currentIndex;

  /**
   * Creates an empty array.
   */
  public ArrayList() {
    size = 10;
    array = new Type[size];
  }

  /**
   * Adds an element to the end of the array.
   * @param element is an element which is added.
   */
  public void add(Type element) {
    if (array[size - 1] != null) {
      this.sizeIncrease();
    }
    array[currentIndex] = element;
    currentIndex++;
  }

  /**
   * Inserts an element.
   * @param element is an element which is inserted.
   * @param index is an array cell index in which element inserted.
   */
  public void insert(Type element,int index) {
    if (array[size - 1] != null) {
      this.sizeIncrease();
    }
    Type[] newArray = new Type[size];
    System.arraycopy(array,0,newArray,0,index);
    newArray[index] = element;
    System.arraycopy(array,index,newArray,index + 1,array.length - index - 1);
    if (currentIndex == index - 1) {
      currentIndex = index + 2;
    } else {
      currentIndex++;
    }
    array = newArray; 
  }

  /**
   * Remove an element.
   * @param index is the index of an element which is removed.
   */
  public void remove(int index) {
    Type[] newArray = new Type[size];
    System.arraycopy(array,0,newArray,0,index);
    System.arraycopy(array,index + 1,newArray,index,array.length - index - 1);
    currentIndex--;
    array = newArray;
  }
  
  /**
   * Increases size of the array.
   */
  private void sizeIncrease() {    
      size *= 2;
      Type[] newArray = new Type[size];
      System.arraycopy(array,0,newArray,0,array.length);
      array = newArray;
  }
  /**
   * @return the element of the list.
   */
  public Type get(int index) {
   return array[index];
  }   
}
