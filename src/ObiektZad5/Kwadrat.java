package ObiektZad5;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int obliczObwod( int i ){

        return 4*bok;}

    public int obliczPole( int i ){

        return bok*bok;}

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "bok=" + bok +
                '}';
    }
}
