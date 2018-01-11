package ObiektZad7;



public class MyMath {
    private int from;
    private double from2,from3;

    public MyMath() {
        this.from = from;
        this.from2 = from2;
        this.from3 = from3;
    }

    public int abs (int from){
        return Math.abs(from);
    }
    public double pow (double from2, double from3)
    {
        return Math.pow(from2, from3);
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public double getFrom2() {
        return from2;
    }

    public void setFrom2(double from2) {
        this.from2 = from2;
    }

    public double getFrom3() {
        return from3;
    }

    public void setFrom3(double from3) {
        this.from3 = from3;
    }

    @Override
    public String toString() {
        return "MyMath{" +
                "from=" + from +
                ", from2=" + from2 +
                ", from3=" + from3 +
                '}';
    }
}
