package AbstructfactoryPattern;

public class ICB implements Ibank{
  private final String Bname;

  public ICB() {
    Bname = "ICB bank";
  }
  
  public String getbankName() {
    return Bname;
    }
  
} // end of class ICB

