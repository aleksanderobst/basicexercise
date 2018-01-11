public class Truck {
    private static final int FUEL_FACTOR = 2;

    private String name;
    private long distance;
    private int fuel;

    public Truck(String name) {
        this.name = name;
        this.distance = 0;
        this.fuel = 0;
    }

    public Truck(String name, long distance, int fuel) {
        this.name = name;

        if (distance < 0) {
            this.distance = 0;
            System.out.println("Podales ujemny dystans!");
        } else {
            this.distance = distance;
        }

        if (fuel < 0) {
            this.fuel = 0;
            System.out.println("Podales ujemne paliwo!");
        } else {
            this.fuel = fuel;
        }

        System.out.println("Stworzyles auto, co moze przejechac " + fuel/FUEL_FACTOR + " kilometrow!");
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

    public void drive(int kmToDrives) {
        // TODO: dodac sprawdzenie ujemnych kilometrow
        int neededFuel = kmToDrives * FUEL_FACTOR;

        // jesli mam za malo paliwa
        if (fuel < neededFuel) {
            System.out.println("Sorry, nie moge jechac, nie mam paliwa");
            System.out.println("Moge przejechac: " + fuel / FUEL_FACTOR);
        } else {
            distance = distance + kmToDrives;
            fuel = fuel - neededFuel;
            System.out.println("Jade " + kmToDrives + " kilometrow i wypije " + neededFuel + " paliwa");
        }
    }

    public void tank(int litres) {
        // TODO: dodac implementacje tankowania
        // uwaga na ujemne wartosci
        // warto dodac komunikat:
        // np: miales 10 litrow, teraz masz 50litrow




            if (litres < 0) {
                this.fuel = 0;
                System.out.println("Podales ujemna ilosc zatankowanego paliwa!");
            } else {
                this.fuel = fuel;
                System.out.println("Miałes"+ fuel + "paliwa, teraz masz"+ litres+fuel);
            }



        }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", fuel=" + fuel +
                '}';
    }

    public static void main(String[] args) {

    }
}




