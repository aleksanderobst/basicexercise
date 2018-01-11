package gdynia.person;

public class Person2 {
    private String name;
    private String surname;
    private int age;

    public Person2(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public int copareTo(String p){
        return 0;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
