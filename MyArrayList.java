/**
 * Realisation of a dynamic Array
 */
public class MyArrayList {
  private String[] array;
  private int capasity;
  /**
   * The field that specifies the index of the array element that follows must be filled by MyArrayList.add().
   */
  private int currentIndex;

  /**
   * Creates an empty array.
   */
  public ArrayList() {
    capasity = 10;
    array = new String[capasity];
  }

  /**
   * Adds an element to the end of the array.
   * @param element is an element which is added.
   */
  public void add(String element) {
    if (array[capasity - 1] != null) {
      this.capasityIncrease();
    }
    array[currentIndex] = element;
    currentIndex++;
  }

  /**
   * Inserts an element.
   * @param element is an element which is inserted.
   * @param index is an array cell index in which element inserted.
   */
  public void insert(String element,int index) {
    if (array[capasity - 1] != null) {
      this.capasityIncrease();
    }
    System.arraycopy(array,index,array,index + 1,array.length - index - 1);
    array[index] = element;
    if (currentIndex == index - 1) {
      currentIndex = index + 2;
    } else {
      currentIndex++;
    } 
  }

  /**
   * Removes an element.
   * @param index is the index of an element which is removed.
   */
  public void remove(int index) {
    System.arraycopy(array,index + 1,array,index,array.length - index - 1);
    currentIndex--;
  }
  
  /**
   * Increases size of the array.
   */
  private void capasityIncrease() {    
      capasity *= 2;
      String[] newArray = new String[capasity];
      System.arraycopy(array,0,newArray,0,array.length);
      array = newArray;
  }
  
  /**
   * @return current size of the list.
   */
  public int getSize() {
    return currentIndex;
  }
  
  /**
   * @return the element of the list.
   */
  public String get(int index) {
   return array[index];
  }   
}
