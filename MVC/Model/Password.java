package MVC.Model;

public class Password {
    private String password;
    private String username;
    private String homepage;

    public Password(String homepage, String username, String password) {
        this.password = password;
        this.username = username;
        this.homepage = homepage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}
