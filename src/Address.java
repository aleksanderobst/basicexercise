public class Address {
    private String city;
    private String street;
    private int nr;

    public Address(String city, String street, int nr) {
        this.city = city;
        this.street = street;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", nr=" + nr +
                '}';
    }
}
