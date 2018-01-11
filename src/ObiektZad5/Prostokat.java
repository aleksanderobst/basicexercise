package ObiektZad5;

public class Prostokat {
    private int boka;
    private int bokb;

    public Prostokat(int boka, int bokb) {
        this.boka = boka;
        this.bokb = bokb;
    }

    public int obliczObwod(int boka,int bokb ){

        return (2*boka)+(2*bokb);}

    public int obliczPole(int boka,int bokb){

        return boka*bokb;}

    public int getBoka() {
        return boka;
    }

    public void setBoka(int boka) {
        this.boka = boka;
    }

    public int getBokb() {
        return bokb;
    }

    public void setBokb(int bokb) {
        this.bokb = bokb;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "boka=" + boka +
                ", bokb=" + bokb +
                '}';
    }
}
