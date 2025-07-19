package jul19.bankdemo;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(1000007, 1000.0, "Savings", "Edward");
        bank.printAccountInfo();
    }
}
