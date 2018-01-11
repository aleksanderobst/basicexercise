package gdynia.immutable;

public class Timeimmutable {
    private int hour;
    private int minute;

    public Timeimmutable(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Timeimmutable nextHour(){

        return new Timeimmutable(hour+1, minute);
    }

    public int getHour() {
        return hour;
    }
}
