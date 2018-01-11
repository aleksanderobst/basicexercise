public class Greedy {

    public static void main(String[] args) {
        int a = 5;
        // 1) if (true && a == returnFive()) {
        // 2) if (true & a == returnFive()) {
        // 3) if (true || a == returnFive()) {
        // 4) if (true | a == returnFive()) {
        // 5) if (false && a == returnFive()) {
        // 6) if (false & a == returnFive()) {
        // 7) if (false || a == returnFive()) {
        // 8) if (false | a == returnFive()) {

        if (false & a == returnFive()) {
            System.out.println("Weszło do IFa!!!");
        }
    }

    private static int returnFive() {
        System.out.println("uruchamia five");
        return 5;
    }
}