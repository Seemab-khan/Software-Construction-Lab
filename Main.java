public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ali", -50);
        BankAccount account2 = new BankAccount("Danish", 1000.0);

        account2.deposit(500);
        account2.withdraw(200);

        account2.displayAccountDetails();

        account1.deposit(-100);
        account1.withdraw(50);
        account1.displayAccountDetails();

        System.out.println("Final Details :" + account1.getAccountHolder() + account1.getBalance());
        System.out.println("Final Details :" + account2.getAccountHolder() + account2.getBalance());
    }
}