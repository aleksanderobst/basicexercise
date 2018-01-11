package ObiektZad1;

public class Osoba {

    private String name;
    private int age;

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printNameAge() {
        System.out.println("Imie to " + name+" wiek to "+age+".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "Jestem '" + name + '\'' +
                ", mam " + age + " lat." +
                '}';
    }
}


