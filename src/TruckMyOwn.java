public class TruckMyOwn {
    private static final int FUEL_RATIO = 2;
    private String name;
    private long distance;
    private int fuel;
    private int planDistance;
    private int fuelDeposit;
    private int sum;

public TruckMyOwn(){
 name = "Scania";
 distance = 0;
 fuel = 0;
}

    public TruckMyOwn(String name, long distance, int fuel) {
        this.name = name;
        this.distance = distance;
        this.fuel = fuel;
        if (distance <= 0){
            distance = 0;
            System.err.println("Błędna wartość dystansu - mniejsza od zera lub równa zero");
        }
        if (fuel <= 0){
            fuel = 0;
            System.err.println("Błędna wartość paliwa - mniejsza od zera lub równa zero");
        }

        System.out.println("Stworzyłeś auto co może przejechać " + fuel/FUEL_RATIO+ " km.");

    }

    public void tank(int fuelDeposit) {
        // TODO: dodac implementacje tankowania
        // uwaga na ujemne wartosci
        // warto dodac komunikat:
        // np: miales 10 litrow, teraz masz 50litrow
        //Wlewasz tyle paliwa

        if (fuelDeposit<0){
            System.err.println("Błędna ujemna wartość wlanego paliwa");

        }
        else {
            sum =  fuelDeposit+fuel;
            System.out.println("Miałeś "+fuel+"litrów paliwa."+" Wlałeś "+ fuelDeposit +" litrów paliwa."+ " Masz łącznie "
                    + sum +" litrów paliwa.");
            fuel = fuel + fuelDeposit;
        }
    }

    void drive(int planDistance){

     //ile chcemy przejechac

    if (planDistance*FUEL_RATIO < fuel){
        distance = distance + planDistance;
        fuel = fuel - planDistance*FUEL_RATIO;
        System.out.println("Przejechano "+planDistance+"km.");
    }
    else {
        distance = distance;
        System.err.println("Nie można przejechać "+planDistance+ " km.");
       int c = fuel/FUEL_RATIO;
        System.err.println("Można przejechać jedynie "+c+" km.");
    }
    }

    public String getName() {
        return name;
    }

    public long getDistance() {
        return distance;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "TruckMyOwn{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", fuel=" + fuel +
                '}';
    }
}