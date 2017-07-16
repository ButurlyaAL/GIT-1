public class EquaterialTriangle extends Triangle {
  public EquaterialTriangle(String[] sequence) {
    super(sequence);
    exists();
  }
  public void exists() {
    if(!(firstSide.add(secondSide).compareTo(thirdSide) == 1 && firstSide.add(thirdSide).compareTo(secondSide) == 1 && secondSide.add(thirdSide).compareTo(firstSide) == 1)) {
      throw new IllegalArgumentException();
    }   
    if(!(firstSide.compareTo(secondSide) == 0 && secondSide.compareTo(thirdSide) == 0)) {
      throw new IllegalArgumentException();  
    } 
  }
  public String getType() {
    return "Triangle is equaterial.";
  }
}
