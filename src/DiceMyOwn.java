public class DiceMyOwn {

    private int number;

    public DiceMyOwn(int number){
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "Wynik rzutu kostką to:" + "[" + number + "]";
    }
}
