public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount savings = new BankAccount();
        BankAccount checking = new BankAccount();


        System.out.println(BankAccount.numOfAccounts);

        savings.depositMoney("savings", 200);
        checking.depositMoney("checking", 500);
        savings.withdrawMoney("savings", 100);
        checking.withdrawMoney("checking",200);
        System.out.println(savings.getCheckingBalance());
        System.out.println(checking.getSavingsBalance());
        System.out.println(BankAccount.totalMoney);
    }
}