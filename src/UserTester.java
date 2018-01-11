public class UserTester {
    public static void main(String[] args) {


    User user = new User("Basia","Ciecielewska", 34,"Gdynia", "10 lutego", 23);
        User user2 = new User("Dominika","Kuś", 23,"Gdańsk", "Warszawianki", 56);
        System.out.println(user.toString());

        System.out.println(user);
        System.out.println(user2);
       User.printAmountOfUsers();
        System.out.println(user.getEmail());
}
}
