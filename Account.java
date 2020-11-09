 //ATM 
import java.io.IOException;
public class ATM extends MenuOption{

  public static void main(String[] args) throws IOException {
    MenuOption MenuOption= new MenuOption();

    MenuOption.getLogin();
  }

};
//UserAccount
import java.text.DecimalFormat;
import java.util.*;

public class UserAccount {

  Scanner input = new Scanner(System.in);
  DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

  public int setcustomerIDNumber(int customerIDNumber){
    this.customerIDNumber = customerIDNumber;
    return customerIDNumber;
  }

  public int getcustomerIDNumber(){
    return customerIDNumber;
  }

  public int setpinCodeNumber(int pinCodeNumber){
    this.pinCodeNumber = pinCodeNumber;
    return pinCodeNumber;
  }

  public int getpinCodeNumber(){
    return pinCodeNumber;
  }

  public double getCheckingAccAccBalance(){
    return checkingAccBalance;
  }

  public double getSavingAccBalance(){
    return savingAccBal;
  }

  public double calcCheckingAccWithdraw(double AmountRs){
    checkingAccBalance = (checkingAccBalance - AmountRs);
    return checkingAccBalance;
  }

  public double calcSavingAccWithdraw(double AmountRs){
    savingAccBal = (savingAccBal - AmountRs);
    return savingAccBal;
  }

  public double calcCheckingAccDeposit(double AmountRs){
    checkingAccBalance = (checkingAccBalance + AmountRs);
    return checkingAccBalance;
  }

  public double calcSavingAccDeposit(double AmountRs){
    savingAccBal = (savingAccBal + AmountRs);
    return savingAccBal;
  }

  public void getCheckingAccWithdrawInput(){
    System.out.println("Checking UserAccount Balance: " + moneyFormat.format(checkingAccBalance));
    System.out.print("AmountRs you want to withdraw from Checking UserAccount: ");
    double AmountRs =input.nextDouble();

    if((checkingAccBalance-AmountRs)>=0){
      calcCheckingAccWithdraw(AmountRs);
      System.out.println("New Checking UserAccount Balance: " + moneyFormat.format(checkingAccBalance));
      }else{
      System.out.println("Balance Cannot be Negative." + "\n");
      }
    }

    public void getsavingAccWithdrawInput(){
      System.out.println("Saving UserAccount Balance: " + moneyFormat.format(savingAccBal));
      System.out.print("AmountRs you want to withdraw from saving UserAccount: ");
      double AmountRs =input.nextDouble();

      if((savingAccBal-AmountRs)>=0){
        calcSavingAccWithdraw(AmountRs);
        System.out.println("New saving UserAccount Balance: " + moneyFormat.format(savingAccBal));
        }else{
        System.out.println("Balance Cannot be Negative." + "\n");
        }
      }

      public void getCheckingAccDepositInput(){
        System.out.println("Checking UserAccount Balance: " + moneyFormat.format(checkingAccBalance));
        System.out.print("AmountRs you want to Deposit from Checking UserAccount: ");
        double AmountRs =input.nextDouble();

        if((checkingAccBalance+AmountRs)>=0){
          calcCheckingAccDeposit(AmountRs);
          System.out.println("New Checking UserAccount Balance: " + moneyFormat.format(checkingAccBalance));
          }else{
          System.out.println("Balance Cannot be Negative." + "\n");
          }
        }

        public void getSavingAccDepositInput(){
          System.out.println("Saving UserAccount Balance: " + moneyFormat.format(savingAccBal));
          System.out.print("AmountRs you want to Deposit from saving UserAccount: ");
          double AmountRs =input.nextDouble();

          if((savingAccBal+AmountRs)>=0){
            calcSavingAccDeposit(AmountRs);
            System.out.println("New saving UserAccount Balance: " + moneyFormat.format(savingAccBal));
            }else{
            System.out.println("Balance Cannot be Negative." + "\n");
            }
          }

        private int customerIDNumber;
        private int pinCodeNumber;
        private double checkingAccBalance = 0;
        private double savingAccBal = 0;
}
