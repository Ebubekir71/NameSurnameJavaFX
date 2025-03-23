package com.example.namesurnamejavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {
    @FXML
    private TextField userNameField;
    @FXML
    private Label loginMessage;
    @FXML
    private TextField passwordField;


    public void loginButtonOnAction(javafx.event.ActionEvent actionEvent) throws IOException {

        if(userNameField.getText().equals("ebubekir") && passwordField.getText().equals("1234")){

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("homeView.fxml"));
            Parent root = loader.load();

            HomeController homeController = loader.getController();
            homeController.setUserName(userNameField.getText());

            Stage stage = (Stage) userNameField.getScene().getWindow();
            stage.setScene(new Scene(root, 400, 300));
        } else{
            loginMessage.setText("Invalid Username or Password");
        }

    }
}