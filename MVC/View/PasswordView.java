package MVC.View;

import MVC.Controller.PasswordController;
import MVC.Model.Password;

import java.util.List;
import java.util.Scanner;

public class PasswordView {

    private PasswordController passwordController;

    public PasswordView() {
    }

    public void Start() {
        System.out.println("Enter a master password");
        Scanner scanner = new Scanner(System.in);
        passwordController = new PasswordController(scanner.nextLine());
        System.out.println("Master password is now set");
        startMenu(scanner);
    }

    private void startMenu(Scanner scanner) {
        boolean run = true;
        while (run) {
            System.out.println("\nWhat do you want to do? add, edit or show? end with q");
            String input = scanner.nextLine();
            switch (input) {
                case "add":
                    if (passwordController.add(readMasterPassword(scanner), readHomepage(scanner), readUsername(scanner), readPassword(scanner)))
                        System.out.println("new entry added correctly");
                    else
                        System.out.println("did not add");
                    break;
                case "edit":
                    if (passwordController.edit(readMasterPassword(scanner), readHomepage(scanner), readPassword(scanner)))
                        System.out.println("edited entry correctly");
                    else
                        System.out.println("did not edit");
                    break;
                case "show":
                    List<Password> passwordList = passwordController.show(readMasterPassword(scanner));
                    System.out.println("all your stored passwords are: ");
                    for (Password p : passwordList) {
                        System.out.println(p.getHomepage() + "\t\t" + p.getUsername() + "\t\t" + p.getPassword());
                    }
                    break;
                case "q":
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    private String readMasterPassword(Scanner scanner) {
        System.out.println("enter master pwd: ");
        return scanner.nextLine();
    }

    private String readHomepage(Scanner scanner) {
        System.out.println("enter homepage: ");
        return scanner.nextLine();
    }

    private String readUsername(Scanner scanner) {
        System.out.println("enter username: ");
        return scanner.nextLine();
    }

    private String readPassword(Scanner scanner) {
        System.out.println("enter new password: ");
        return scanner.nextLine();
    }
}
