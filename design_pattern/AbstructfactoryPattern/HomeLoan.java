package AbstructfactoryPattern;

public class HomeLoan extends A_Loan {
  @Override
  void getInterestRate(double rate) {
    this.rate = rate;
  }
} // end of class HomeLoan

