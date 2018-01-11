package ObiektZad6;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(0);
        System.out.println(account.toString());
        account.addMoney(200);
        System.out.println(account.toString());
        account.substractMoney(200);
        System.out.println(account.toString());
        System.out.println("Stan konta: "+account.printBankAccountStatus()+ " zł.");


    }
}