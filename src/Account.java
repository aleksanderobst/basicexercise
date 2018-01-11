public class Account {

    private int amount;
    private int number;
    private int withdraw2;
    private int withdraw3;
    private int deposit;
    private int withdraw;


    /**
     * Konstruktor domyslny, ustawia ilosc kasy na koncie na 0
     */
    public Account() {
        this.amount = 0;
        this.withdraw = 0;
        this.deposit = 0;

    }


    /**
     * Konstruktor z parametrem.
     * Tworzy konto ustawiajac kase na zadana wartosc.
     * Jesli przekazemy mniej niz 0, powinien sie pojawic
     * stosowny komunikat (przy uzyciu System.err.println())
     * W takim przypadku stan konta powinien byc ustawiony na 0.
     *
     *
     */
    public Account(int amount, int deposit, int withdraw) {

        if (amount < 0){
            System.out.println("Stan konta nie może być ujemny przy zakładaniu konta");
            this.amount = 0;
        }
        else {
            this.amount = this.amount;
        }

        this.deposit = deposit;
        this.withdraw = withdraw;
        if (deposit < 0){
            System.out.println("Wpłacasz ujemną wartość lub zero - bląd");
        }
        else {
            amount = amount + deposit;
        }
        this.amount = amount;

        if (withdraw < 0){
            System.err.println("Wypłacasz ujemną wartość lub zero - bląd");

        }
        else {
            this.amount = this.amount - withdraw;
        }
        this.amount = this.amount;
    }


    /**
     * Metoda umozliwiajaca wplate kasy.
     * Ma zwracac ilosc pieniedzy po wplaceniu.
     *
     * Jesli probujemy wplacic ilosc pieniedzy
     * rowna lub mniejsza od zera, powinien pojawic sie
     * stosowny komunikat (przy uzyciu System.err.println())
     * Jesli wyplacamy < 0, to stan nie powinien sie zmienic.
     *
     * @param
     * @return
     */
    public int deposit(int number) {
        if (number<0){
            System.err.println("Wpłacasz ujemną wartość");
        }
        else
        {
            this.amount = this.amount + number;
            this.deposit = number;
            this.withdraw = 0;
            System.out.println("Wpłacono "+number+" zł");

        }

        // TODO: tutaj powinien byc kod, ktory ustawia ta kase
        // oraz zwraca obecny stan konta
        // dodatkowo wyswietla komunikat
        return this.amount;
    }

    /**
     * Metoda umozliwiajaca wyplate kasy.
     * Ma zwraca ilosc pieniedzy po wyplaceniu.
     *
     * Jesli probujemy wyplacic ilosc pieniedzy
     * rowna lub mniejsza od zera, powinien pojawic sie
     * stosowny komunikat (przy uzyciu System.err.println().
     * W tym wypadku stan nie powinien sie zmienic.
     *
     * Jesli probujemy wyplacic wiecej pieniedzy niz posiadamy,
     * takze powinien pojawic sie jakis komunikat.
     * Mimo wszystko ma dojsc do wyplaty.
     *
     *
     */
    public int withdraw(int withdraw2) {
        // TODO: tutaj powinien byc kod, ktory wyplaca kase
        // zwraca obecny stan oraz prezentuje komunikat
        if (withdraw2<0){
            System.out.println("Wyłacasz ujemną wartość");
        }
        else
        {
            this.amount = this.amount - withdraw2;
            if (amount<0){
                System.out.println("Masz debet = "+ (  amount));
            }
            this.withdraw =  withdraw2;
            this.deposit = 0;
            System.out.println("Wypłacono "+withdraw2+" zł");
        }
        return this.amount;

    }

    /**
     * Metoda umozliwiajaca pobranie ilosci pieniedzy.
     * Ma wyswietlac stosowny komunikat, jesli mamy
     * mniej niz zero pieniedzy.
     *
     * @return
     */
    public void getAmount(int withdraw3) {
        // TODO: zwraca obecny stan kasy
        // oraz wyswietla ewentualny komunikat
        System.out.println("Pobierasz"+withdraw3+" zł.");

        if (withdraw3<=0){
            System.out.println("Wpłacasz ujemną lub zerową wartość");

        System.err.println("Możesz wypłacić "+amount);}
        else
        {
            amount = amount - withdraw3;

            System.out.println("Wpłacono "+number+" zł");
        }

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWithdraw2() {
        return withdraw2;
    }

    public void setWithdraw2(int withdraw2) {
        this.withdraw2 = withdraw2;
    }

    public int getWithdraw3() {
        return withdraw3;
    }

    public void setWithdraw3(int withdraw3) {
        this.withdraw3 = withdraw3;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    /**
     * Metoda reprezentujaca stan konta.
     * Powinna zwracac napis, np: Amount=150
     * @return
     */

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", deposit=" + deposit +
                ", withdraw=" + withdraw +
                '}';
    }
}

