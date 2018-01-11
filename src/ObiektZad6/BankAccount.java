package ObiektZad6;

public class BankAccount {

    private int amount;

    public BankAccount() {
        this.amount = 0;
    }

    public BankAccount(int amount)
    {
        this.amount = amount;
    }

    public void substractMoney(int withdraw){
        amount = amount - withdraw;
    }
    public void addMoney(int deposit){
         amount = amount + deposit;
    }

    public int printBankAccountStatus() {
        return amount;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "amount=" + amount +
                '}';
    }
}
