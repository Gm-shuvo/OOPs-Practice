package AbstructfactoryPattern;

public abstract class AbstractFactory {
  public abstract Ibank getBank(String bank);
  public abstract A_Loan getLoan(String loan);
}
