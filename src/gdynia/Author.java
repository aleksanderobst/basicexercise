package gdynia;

public class Author {

    private int year;
    private String name;
    private String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
