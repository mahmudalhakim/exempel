package MVC.Controller;

import MVC.Model.Password;
import MVC.Model.PasswordHolder;

import java.util.List;

public class PasswordController {

    private PasswordHolder passwordHolder;

    public PasswordController(String masterPassword) {
        this.passwordHolder = new PasswordHolder(masterPassword);
    }

    public boolean add(String masterPassword, String homepage, String username, String password){
        return passwordHolder.addNewPassword(masterPassword, homepage, username, password);
    }

    public boolean edit(String masterPassword, String homepage, String password){
        return passwordHolder.editPassword(masterPassword, homepage, password);
    }

    public List<Password> show(String masterPassword){
        return passwordHolder.getMyPasswords(masterPassword);
    }
}
