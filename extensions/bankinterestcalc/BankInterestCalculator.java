package bankinterestcalc;

public class BankInterestCalculator {

	 

    public static void main(String[] args) {
          double initialBalance = 4000;
          System.out.println("  Day  " + "  Type  " + "  Amount  " + "  Balance  \n");
          int day = 1;
          for (day = 1; day != 31; day++){
                 if(Math.random() > .5){
                        String type = "Withdrawl";
                        String withdrawlAmount = "$100.00";
                        double adjustedBalance = (Math.round((initialBalance - 100.00) * 10.0) / 10.0);
                        System.out.println("   " + day + "   "+ type + " " + withdrawlAmount + "     " + "$" + adjustedBalance);
                        initialBalance = adjustedBalance;
                        if (day == 30){
                              System.out.println();
                              System.out.println("Interest earned " + "$" + (adjustedBalance * .02));
                              System.out.println("Money after one month's interest: " + "$" + (adjustedBalance + (adjustedBalance * .02)));
                        }
                        else{}}
                 else {
                        String type = "Deposit";
                        String depositAmount = "$200.50";
                        double adjustedBalance = (Math.round((initialBalance + 200.50) * 10.0) / 10.0);
                        System.out.println("   " + day + "   "+ type + "   " + depositAmount + "     " + "$" + adjustedBalance);
                        initialBalance = adjustedBalance;
                        if (day == 30){
                              System.out.println();
                              System.out.println("Interest earned " + "$" + (adjustedBalance * .02));
                              System.out.println("Money after one month's interest: " + "$" + (adjustedBalance + (adjustedBalance * .02)));
                        }
                        else{}}
                 }
          }
    }