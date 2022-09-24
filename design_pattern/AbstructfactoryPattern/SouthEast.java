package AbstructfactoryPattern;

public class SouthEast implements Ibank{
  private final String Bname;

  public SouthEast() {
    Bname = "SouthEast bank";
  }
  
  public String getbankName() {
    return Bname;
    }
  
} // end of class SouthEast
