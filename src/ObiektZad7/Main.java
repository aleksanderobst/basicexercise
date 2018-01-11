package ObiektZad7;

public class Main {
    public static void main(String[] args) {
        MyMath mymath = new MyMath();
        int abs = mymath.abs(-5);
        double pow= mymath.pow(2,3);
        System.out.println(abs);
        System.out.println(pow);
    }
}
