public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numOfAccounts =0;
    public static double totalMoney =0;

    public BankAccount(){
        numOfAccounts++;

    }
    public void depositMoney(String account, double amount){
        if (account == "savings") {
            this.savingsBalance = this.savingsBalance+amount;
            System.out.println("Savings balance: "+this.savingsBalance);
            System.out.println("$"+amount+" deposited in savings account");
            totalMoney = totalMoney+amount;
        } else if(account =="checking") {
            checkingBalance = checkingBalance+amount;
            System.out.println("Checking balance: "+this.checkingBalance);
            System.out.println("$"+amount+" deposited in checking account");
            totalMoney = totalMoney+amount;
        } else{
            System.out.println("please choose savings or checking option");
        }
        System.out.println("Checking balance: "+this.checkingBalance);
        System.out.println("Savings balance: "+this.savingsBalance);
    }
    public void withdrawMoney(String account, double amount){
        if(account == "savings"){
            if(this.savingsBalance- amount>0){
                this.savingsBalance = this.savingsBalance-amount;
                System.out.println("Savings balance: "+this.savingsBalance);
                System.out.println("$"+amount+" withdrawn from savings account");
                totalMoney = totalMoney-amount;
            } else{
                System.out.println("Insufficient funds in savings account");
            }
        }else if(account == "checking"){
            if(this.checkingBalance - amount >0){
                this.checkingBalance = this.checkingBalance-amount;
                System.out.println("Checking balance: "+this.checkingBalance);
                System.out.println("$"+amount+" withdrawn from checking account");
                totalMoney = totalMoney-amount;
            }else{
                System.out.println("Insufficient funds in savings account");
            }
        }else {
            System.out.println("please choose savings or checking option");
        }
        System.out.println("Checking balance: "+this.checkingBalance);
        System.out.println("Savings balance: "+this.savingsBalance);
    }
    public double getCheckingBalance() {
        System.out.println(this.checkingBalance);
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public double totalAccountsBalance(){
        return checkingBalance+savingsBalance;
    }
    public static int numberOfAccounts(){
        return numOfAccounts;
    }
    public static double totalValueAccounts(){
        return totalMoney;
    }

}