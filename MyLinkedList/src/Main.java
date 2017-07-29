public class Main {
  public static void main(String[] args) {
    MyLinkedList<Integer> list = new MyLinkedList<>();
    for (int i = 0; i < 27; i++) {
      list.addLast(3*i);
    }
    System.out.println(list.getCount());
    for (int i : list) {
      System.out.print(i + " ");
    }
    list.clear();
    for (int i : list) {
      System.out.print(i + " ");
    }
    System.out.println(list.getCount());
  }
}
