public class AccountTester {

    public static void main(String[] args) {
        // tworze konto uzywajac domyslnego konstruktora

        Account account = new Account(100, 200,10);
       System.out.println(account.toString());
        account.withdraw(100);
       System.out.println(account.toString());
        System.out.println();
        System.out.println();
        account.deposit(120);
        System.out.println(account.toString());
        // powinno zwrocic 0
        System.out.println();
        System.out.println();

        // tworze konto z kasa o wartosci 300
       // Account accountWith300 = new Account(300);
        Account accountWith300 = new Account(300,0,0);
        System.out.println(accountWith300.toString());
        // powinno zwrocic 300
       // amount = account.getAmount();
       // System.out.println("Amount: " + amount);

        System.out.println("Amount:" + accountWith300.getAmount());

        System.out.println();
        System.out.println();
        // 1) utworz konto przekazujac -400
        // powinien sie pojawic komunikat z bledem
        // stan konta powinien byc 0
        Account accountWith301 = new Account(-400,0,0);
        System.out.println();
        System.out.println();
      //  Account account2 = new Account(1000, -400, 0);
       // System.out.println(account2);
        Account accountWith302 = new Account(1000,-400,0);

        // 2) utworz konto przekazujac 200
        // stan konta powinien miec 200
        // po wykonaniu deposit z argumentem < 0
        // powinien sie pojawic stosowny komunikat
        // stan konta nie powinien sie zmienic
        System.out.println();
        System.out.println();
        Account accountWith303 = new Account(200,-400,0);

        System.out.println();
        System.out.println();
        // 3) utworz konto przekazujac 200
        // stan konta powinien miec 200
        // po wykonaniu deposit z argumentem 500
        // stan konta powinien byc 700
        Account accountWith304 = new Account(200,0,0);
        accountWith304.deposit(500);
        System.out.println(accountWith304);
        // 4) utworz konto przekazujac 300
        // stan konta powinien byc 300
        // wyplac -400
        // powinien pojawic sie komunikat bledu
        // stan powinien zostac na 300
        System.out.println();
        System.out.println();
        Account accountWith305 = new Account(300,0,0);
        accountWith305.withdraw(-400);
        System.out.println(accountWith305);

        // 4) utworz konto przekazujac 300
        // stan konta powinien byc 300
        // wyplac 700
        // powinien pojawic sie komunikat
        // stan powinien sie zmienic na -400
        System.out.println();
        System.out.println();
        Account accountWith306 = new Account(300,0,0);
        accountWith306.withdraw(700);
        System.out.println(accountWith306);
        // 5) utworz konto przekazujac 500
        // stan konta powinien byc 500
        // wyplac 300
        // stan powinien byc 200
        System.out.println();
        System.out.println();
        Account accountWith307 = new Account(500,0,0);
        accountWith307.withdraw(300);
        System.out.println(accountWith307);
        System.out.println();
        System.out.println();
        // 6) dodaj wlasne scenariusze
        Account accountWith308 = new Account(0,0,-110);

        System.out.println(accountWith308);
    }
}