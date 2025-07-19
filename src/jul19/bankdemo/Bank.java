package jul19.bankdemo;

public class Bank {

    int accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountType;
    static double rateOfInterest = 4.5;

    public Bank(int accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Bank(int accountNumber,
                double accountBalance,
                String accountType,
                String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.accountHolderName = accountHolderName;
    }

    public double deposit(double amount){
        return 0.0;
    }

    public double withdraw(double amount){
        return 0.0;
    }


    public double getBalance(){
        return 0.0;
    }

    public void printAccountInfo(){
        System.out.println("****Welcome to Pragra Bank *****");
        System.out.println("Account INFO ");
        System.out.println("Account Holder Name : "+ accountHolderName);
        System.out.println("Account Balance : "+ accountBalance);
        System.out.println("Account Type : "+ accountType);
    }
}

/*
SOLID
S- single responsibility
O - open and close principle


 */