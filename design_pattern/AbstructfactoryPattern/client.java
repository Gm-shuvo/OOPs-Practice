package AbstructfactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class client {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the name of Bank from where you want to take loan amount: ");
    String bankName = br.readLine();

    System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
    String loanName = br.readLine();

    AbstractFactory bankFactory = factoryCreator.getfactory("Bank");

    Ibank bank = bankFactory.getBank(bankName);
    System.out.print("Enter the interest rate for " + bank.getbankName() + ": ");
    double rate = Double.parseDouble(br.readLine());
    System.out.println('\n');

    System.out.print("Enter the loan amount you want to take: ");
    double loanAmount=Double.parseDouble(br.readLine());  
    System.out.print("\n");  
    System.out.print("Enter the number of years to pay your entire loan amount: ");  
    int years=Integer.parseInt(br.readLine());  
  
    System.out.print("\n");  
    System.out.println("you are taking the loan from "+ bank.getbankName());  
  
    AbstractFactory loanFactory = factoryCreator.getfactory("Loan");  
        A_Loan l = loanFactory.getLoan(loanName);  
        l.getInterestRate(rate);  
        l.calculateLoanPayment(loanAmount,years);  
  }  
}

