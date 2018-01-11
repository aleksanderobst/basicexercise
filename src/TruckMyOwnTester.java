public class TruckMyOwnTester {
    public static void main(String[] args) {
        TruckMyOwn truck = new TruckMyOwn("Scania", 20, 100);
        System.out.println(truck.toString());
        truck.drive(10);
        System.out.println(truck.toString());
        truck.tank(-20);
        System.out.println(truck.toString());
    }
}
