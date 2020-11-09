//option menu
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.io.IOException;

public class MenuOption extends UserAccount {
  Scanner menuInput= new Scanner(System.in);
  DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

  HashMap<Integer,Integer> data= new HashMap<Integer,Integer>();

  public void getLogin() throws IOException {
    int x=1;
    do{
      try {
         data.put(952141, 191904);
         data.put(989947, 71976);

         System.out.println("Welcome to the ATM Project!");
         System.out.println("Enter your customer Number");
         setcustomerIDNumber(menuInput.nextInt());

         System.out.print("Enter your PIN Number: ");
         setpinCodeNumber(menuInput.nextInt());
         }
         catch (Exception e) {
           System.out.println("\n"+ "Invalid Character(s). Only Numbers."+"\n");
           x=2;
         }
         /*for(Map.Entry<Integer,Integer> it : data.entrySet()){
           if(it.getkey()==getcustomerIDNumber() && it.getValue()==getpinCodeNumber){
             getUserAccountType();
           }
         }*/
         int cn=getcustomerIDNumber();
         int pn=getpinCodeNumber();
         if(data.containsKey(cn) && data.get(cn)==pn){
             getUserAccountType();
         }else
         System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
    }while(x==1);
  }

  public void getUserAccountType(){
    System.out.println("Select the UserAccount you Want to Access: ");
    System.out.println(" Type 1 - Checking UserAccount");
    System.out.println(" Type 2 - Saving UserAccount");
    System.out.println(" Type 3 - Exit");

    int selectionOption= menuInput.nextInt();

    switch (selectionOption) {
      case 1:
      getCheckingAcc();
      break;

      case 2:
      getSaving();
      break;

      case 3:
      System.out.println("Thank You for using this ATM, bye.  \n");
      break;

      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getUserAccountType();
    }
  }

  public void getCheckingAcc(){
    System.out.println("Checking UserAccount: ");
    System.out.println(" Type 1 - View Balance");
    System.out.println(" Type 2 - Withdraw Funds");
    System.out.println(" Type 3 - Deposit Funds");
    System.out.println(" Type 4 - Exit");
    System.out.print("Choice: ");

    int selectionOption = menuInput.nextInt();

    switch (selectionOption) {
      case 1:
      System.out.println("Checking UserAccount Balance: " + moneyFormat.format(getCheckingAccAccBalance()));
      getUserAccountType();
      break;

      case 2:
      getCheckingAccWithdrawInput();
      getUserAccountType();
      break;

      case 3:
      getCheckingAccDepositInput();
      getUserAccountType();
      break;

      case 4:
      System.out.println("Thank You for using this ATM, bye.");
      break;

      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getCheckingAcc();
    }
  }


  public void getSaving(){
    System.out.println("Saving UserAccount: ");
    System.out.println(" Type 1 - View Balance");
    System.out.println(" Type 2 - Withdraw Funds");
    System.out.println(" Type 3 - Deposit Funds");
    System.out.println(" Type 4 - Exit");
    System.out.print("Choice: ");

    int selectionOption = menuInput.nextInt();

    switch (selectionOption) {
      case 1:
      System.out.println("Saving UserAccount Balance: " + moneyFormat.format(getSavingAccBalance()));
      getUserAccountType();
      break;

      case 2:
      getsavingAccWithdrawInput();
      getUserAccountType();
      break;

      case 3:
      getSavingAccDepositInput();
      getUserAccountType();
      break;

      case 4:
      System.out.println("Thank You for using this ATM, bye.");
      break;

      default:
      System.out.println("\n" + "Invalid Choice." + "\n");
      getCheckingAcc();
    }
  }

}