public class Car {

    private String vendor;
    private String model;
    private int year;

    public Car(int i, String a5) {

    }

    public Car(String vendor, String model, int year) {
        this.vendor = vendor;
        this.model = model;
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

