package MVC.Model;

import java.util.ArrayList;
import java.util.List;

public class PasswordHolder {

    private String masterPassowrd;
    private List<Password> myPasswords;

    public PasswordHolder(String masterPassowrd) {
        this.masterPassowrd = masterPassowrd;
        this.myPasswords = new ArrayList<>();
    }

    public boolean addNewPassword(String masterPassowrd, String  homepage, String username, String password) throws IllegalArgumentException {
        if(this.masterPassowrd.compareTo(masterPassowrd) == 0) {
            for (Password p : myPasswords) {
                if (p.getHomepage().compareToIgnoreCase(homepage) == 0) {
                    throw new IllegalArgumentException("A password for homepage " + homepage + " already exist. You should edit a password instead!");
                }
            }
            this.myPasswords.add(new Password(homepage, username, password));
            return true;
        }
        return false;
    }

    public boolean editPassword(String masterPassowrd, String homepage, String newPassword){
        if(this.masterPassowrd.compareTo(masterPassowrd) == 0) {
            for (Password p : myPasswords) {
                if (p.getHomepage().compareToIgnoreCase(homepage) == 0) {
                    p.setPassword(newPassword);
                    return true;
                }
            }
        }
        return false;
    }

    public List<Password> getMyPasswords(String masterPassowrd){
        if(this.masterPassowrd.compareTo(masterPassowrd) == 0){
            return this.myPasswords;
        }
        return null;
    }
}
