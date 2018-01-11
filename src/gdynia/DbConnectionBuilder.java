package gdynia;

public class DbConnectionBuilder {

    private String url;
    private String login;
    private String password;
    private String mode;
    private int port;

    public DbConnectionBuilder url(String url){
        this.url = url;
        return this;
    }

    public DbConnectionBuilder login(String url){
        this.login = login;
        return this;
    }

    public DbConnectionBuilder password(String url){
        this.password = password;
        return this;
    }
    public DbConnectionBuilder port(int port){
        this.port = port;
        return this;
    }
    public int build(){
        DbConnection connection = new DbConnection();
        connection.setLogin(login);
        connection.setPassword(password);
        connection.setUrl(url);
        return 0;
    }

}
