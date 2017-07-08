public class TringleTypeDeterminator {
  public int tringleTypeDetermination(Tringle tringle) {
    int n = 0;
    for (int i = 0; i < 2; i ++) {
      if (tringle.getSide(i).compareTo(tringle.getSide(2)) == 0 || tringle.getSide(i).compareTo(tringle.getSide(i + 1)) == 0) {
        n ++;
      }

    }
    return n;              
  }
}
  