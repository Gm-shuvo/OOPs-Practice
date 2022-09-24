package AbstructfactoryPattern;

public class factoryCreator {
  public static AbstractFactory getfactory(String choice) {
    if(choice.equalsIgnoreCase("Bank")) {
      return new BankFactory();
    }
    else if(choice.equalsIgnoreCase("Loan")) {
      return new LoanFactory();
    }
    return null;
  }
  
}
