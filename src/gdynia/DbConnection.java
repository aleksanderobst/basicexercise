package gdynia;

public class DbConnection {
    private String url;
    private String login;
    private String password;
    private String mode;
    private int port;

    public DbConnection() {
        this.url = url;
        this.login = login;
        this.password = password;
        this.mode = mode;
        this.port = port;
    }

    public DbConnection(String url) {
        this.url = url;
    }

    public DbConnection(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
