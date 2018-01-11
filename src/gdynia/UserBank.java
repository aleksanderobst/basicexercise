package gdynia;

import java.math.BigInteger;

public class UserBank {
    private int numberBank;
    private int pesel;
    private String name;
    private int age;


    public UserBank(int numberBank, int PESEL, String name) {
        this.numberBank = numberBank;
        this.pesel = PESEL;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBank userBank = (UserBank) o;

        if (numberBank != userBank.numberBank) return false;
        if (pesel != userBank.pesel) return false;
        return name.equals(userBank.name);
    }

    @Override
    public int hashCode() {
        int result = numberBank;
        result = 31 * result + pesel;
        result = 31 * result + name.hashCode();
        return result;
    }
}
