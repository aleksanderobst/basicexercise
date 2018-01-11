import java.util.Calendar;

public class Car2 {
    private  String model; //static nie powinien byc
    private int year;

    private static final int WHEEL_AMOUNT = 4;  //poprawne u static

    public Car2(int year, String model) {
        this.year = year;
        this.model = model;



    }

    public String getModel(){
        return model;
    }
    public int getYear() {
        return year;
        }

    public static void main(String[] args) {
        Car2 bmw = new Car2(2017, "x1");
        Car2 audi = new Car2(2015, "a5");

        bmw.model = "fiat";




        System.out.println(bmw.getModel());
        System.out.println(audi.getModel());




    }
    }


