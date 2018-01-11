package ObiektZad2;

public class TeddyBear {

    private String name;

    public TeddyBear(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Imie to " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeddyBear{" +
                "name='" + name + '\'' +
                '}';
    }
}
