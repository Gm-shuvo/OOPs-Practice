package AbstructfactoryPattern;

public class Union implements Ibank{
  private final String Bname;

  public Union() {
    Bname = "Union bank";
  }
  
  public String getbankName() {
    return Bname;
    }
  
} // end of class Union
