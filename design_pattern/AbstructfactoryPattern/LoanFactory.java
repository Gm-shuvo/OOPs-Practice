package AbstructfactoryPattern;

public class LoanFactory extends AbstractFactory{
  @Override
  public A_Loan getLoan(String loan) {
    if (loan == null) return null;
    if (loan.equalsIgnoreCase("home")) return new HomeLoan();
    else if (loan.equalsIgnoreCase("bussiness"))
      return new BussinessLoan();
    else if(loan.equalsIgnoreCase("education"))
      return new EducationLoan();
    return null;
  }
  public Ibank getBank(String bank) {
    return null;
  }
}
