package MVC.View;

import MVC.Controller.PasswordController;
import MVC.Model.Password;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class FXPasswordView extends Application {

    private PasswordController passwordController;
    private final ObservableList<Password> passwords = FXCollections.observableArrayList();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //All components we will need
        VBox outer = new VBox();
        outer.setSpacing(8);
        HBox masterPasswordBox = new HBox();
        HBox addBox = new HBox();
        HBox editBox = new HBox();
        TableView passwordTableView = new TableView();

        //Set the first "row" in our Vertical box.. a horisontal box
        Button buttonSetMasterPassword = new Button("Set");
        TextField textFieldMasterPassword = new TextField();

        masterPasswordBox.getChildren().add(new Label("masterPassword: "));
        masterPasswordBox.getChildren().add(textFieldMasterPassword);
        masterPasswordBox.getChildren().add(buttonSetMasterPassword);

        outer.getChildren().add(masterPasswordBox);

        //Set the second "row" in our Vertical box
        Button buttonAddNewPassowrd = new Button("Add");
        TextField textfieldAdd_Homepage = new TextField();
        TextField textfieldAdd_Username = new TextField();
        TextField textfieldAdd_Password = new TextField();

        addBox.getChildren().add(new Label("Homepage: "));
        addBox.getChildren().add(textfieldAdd_Homepage);
        addBox.getChildren().add(new Label("Username: "));
        addBox.getChildren().add(textfieldAdd_Username);
        addBox.getChildren().add(new Label("Password: "));
        addBox.getChildren().add(textfieldAdd_Password);
        addBox.getChildren().add(buttonAddNewPassowrd);

        outer.getChildren().add(addBox);

        //Set the third "row" in our Vertical box
        Button buttonEditPassowrd = new Button("Edit");
        TextField textfieldEdit_Homepage = new TextField();
        TextField textfieldEdit_Password = new TextField();

        editBox.getChildren().add(new Label("Homepage: "));
        editBox.getChildren().add(textfieldEdit_Homepage);
        editBox.getChildren().add(new Label("Password: "));
        editBox.getChildren().add(textfieldEdit_Password);
        editBox.getChildren().add(buttonEditPassowrd);

        outer.getChildren().add(editBox);

        //Set the fourth "row" in our vertical box
        TableColumn tableColumnHomepage = new TableColumn("Homepage");
        tableColumnHomepage.setCellValueFactory(new PropertyValueFactory<Password, String>("homepage"));
        TableColumn tableColumnUsername = new TableColumn("Username");
        tableColumnUsername.setCellValueFactory(new PropertyValueFactory<Password, String>("username"));
        TableColumn tableColumnPassword = new TableColumn("Password");
        tableColumnPassword.setCellValueFactory(new PropertyValueFactory<Password, String>("password"));

        passwordTableView.setEditable(true);
        passwordTableView.setItems(passwords);  //set the passwordlist so that the tableview observe it.
        passwordTableView.getColumns().addAll(tableColumnHomepage, tableColumnUsername, tableColumnPassword);

        outer.getChildren().add(passwordTableView);

        //Add the most outer component to the scene
        Scene scene = new Scene(outer, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MVC tutorial");
        primaryStage.show();

        buttonAddNewPassowrd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (passwordController.add(textFieldMasterPassword.getText(), textfieldAdd_Homepage.getText(), textfieldAdd_Username.getText(), textfieldAdd_Password.getText())) {
                    passwords.clear();
                    passwords.addAll(passwordController.show(textFieldMasterPassword.getText()));
                    System.out.println("adding went well");
                } else {
                    System.out.println("couldnt add new password");
                }
            }
        });

        buttonEditPassowrd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (passwordController.edit(textFieldMasterPassword.getText(), textfieldEdit_Homepage.getText(), textfieldEdit_Password.getText())) {
                    passwords.clear();
                    passwords.addAll(passwordController.show(textFieldMasterPassword.getText()));
                    System.out.println("edit went well");
                } else {
                    System.out.println("couldn't edit password");
                }
            }
        });

        buttonSetMasterPassword.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("> " + textFieldMasterPassword.getText());
                passwordController = new PasswordController(textFieldMasterPassword.getText());
                buttonSetMasterPassword.setDisable(true);
            }
        });
    }
}
