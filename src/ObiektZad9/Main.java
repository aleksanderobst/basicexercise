package ObiektZad9;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mercedes", "300E", 1990);
        car.setHorsePower(220);


        System.out.println(car.getSpeed());

        System.out.print(car.getCarName());
        System.out.print(" ");
        System.out.print(car.getYear());
        System.out.println();

        car.addPassanger();

        System.out.println(car.toString());
        car.addPassanger();

        car.speedIncrease(220);
        System.out.println(car.getMaxSpeed());
        System.out.println(car.toString());

    }
}
