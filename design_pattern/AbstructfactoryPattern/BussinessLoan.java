package AbstructfactoryPattern;

public class BussinessLoan extends A_Loan {
  @Override
  void getInterestRate(double rate) {
    this.rate = rate;
  }
}
