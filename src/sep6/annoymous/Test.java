package sep6.annoymous;

public class Test {
    public static void main(String[] args) {


        Bank bank = new Bank() {
            @Override
            public void account() {
                System.out.println("Account info , inside annoymous inner class ");
            }
        };
        bank.account();
    }
}
