package ObiektZad9;

public class Car {

    private String brand;
    private String model;
    private int year;
    private int numberOfSeats;
    private int engineCapacity;
    private int horsePower;
    private int speed;
    private int amountOfDistance;
    private int numberOfPasangers;




    public Car(String vendor, String model, int year) {
        this.brand = vendor;
        this.model = model;
        this.year = year;
    }

    public String getCarName() {
        return brand;


    }

    public void setVendor(String vendor) {
        this.brand = vendor;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel( String model) {
        this.model = model;
    }

    public int addPassanger() {
        return numberOfPasangers = numberOfPasangers + 1;
    }

    public int removePassanger() {

        return numberOfPasangers = numberOfPasangers + -1;
    }
    double maxSpeed ;
    public void speedIncrease(int increase) {
        if (numberOfPasangers >= 1) {


            if(getHorsePower() <=200){
                maxSpeed = 1.2 * getHorsePower();
            }else if (getHorsePower() >200){
                maxSpeed = 1.0 * getHorsePower();
            }


            if((speed + increase) > maxSpeed){
                speed = (int)maxSpeed;
            }else{
                speed += increase;
            }
        } else {
            System.out.println("nie ma kierowcy");
        }

    }

    public void speedDecrease(int decrease) {
        if (numberOfPasangers >= 1) {
            speed -= decrease;
        } else {
            System.out.println("nie ma kierowcy");
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAmountOfDistance() {
        return amountOfDistance;
    }

    public void setAmountOfDistance(int amountOfDistance) {
        this.amountOfDistance = amountOfDistance;
    }

    public int getNumberOfPasangers() {
        return numberOfPasangers;
    }

    public void setNumberOfPasangers(int numberOfPasangers) {
        this.numberOfPasangers = numberOfPasangers;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfSeats=" + numberOfSeats +
                ", engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", speed=" + speed +
                ", amountOfDistance=" + amountOfDistance +
                ", numberOfPasangers=" + numberOfPasangers +
                '}';
    }

}
