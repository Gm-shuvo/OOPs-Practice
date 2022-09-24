package AbstructfactoryPattern;

public class EducationLoan extends A_Loan {
  @Override
  void getInterestRate(double rate) {
    this.rate = rate;
  }
} // end of class EducationLoan
