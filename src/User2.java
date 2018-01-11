public class User2 {
    private String login;

    public User2 (String login){

        this.login = login;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User2{" +
                "My login is ='" + login + '\'' +
                '}';
    }
}
