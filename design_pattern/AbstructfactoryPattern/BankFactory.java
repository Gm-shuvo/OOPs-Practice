package AbstructfactoryPattern;

public class BankFactory extends AbstractFactory{
  @Override
  public A_Loan getLoan(String loan) {
    return null;
  }

  @Override
  public Ibank getBank(String bank) {
    if (bank == null) {
      return null;
    }
    if (bank.equalsIgnoreCase("ICB")) {
      return new ICB();
    } else if (bank.equalsIgnoreCase("SouthEast")) {
      return new SouthEast();
    } else if (bank.equalsIgnoreCase("Union")) {
      return new Union();
    }
    return null;
  }
}
