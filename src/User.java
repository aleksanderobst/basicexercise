public class User {

    private String name;
    private String surname;
    private int age;
    private static int counter = 0;
    private String email;
    private static final String EMAIL_DOMAIN_SUFFIX = "sdacademy.pl";
   // private Address address;

    public User(String name, String surname, int age, String city,String street,int nr) {
        this.name = name;
        this.surname = surname;
        this.age = age;
   //     this.address = new Address(city,street, nr);
        this.email = name+ "." + surname +"@"+ EMAIL_DOMAIN_SUFFIX;
        counter++;
    }

    public static void printAmountOfUsers() {
        System.out.println("User3 count " + counter);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



  //  public Address getAddress() {
    //    return address;
  //  }

 //   public void setAddress(Address address) {
 //       this.address = address;
///
    public String getEmail() {return email;}



    @Override
    public String toString() {
        return "User3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +

                ", email='" + email + '\'' +
              //  ", address=" + address +
                '}';
    }
}
