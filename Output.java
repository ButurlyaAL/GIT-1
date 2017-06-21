public class Output {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      if (i % 15 == 0) {
        System.out.println("Tutti-Frutti");
      }
      else if (i % 5 == 0) {
        System.out.println("Frutti");
      }
      else if (i % 3 == 0) {
        System.out.println("Tutti");
      }
      else {
        System.out.println(i);
      }
    }
  }
}


      


