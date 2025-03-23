package com.example.namesurnamejavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {
    @FXML
    private Label profileName;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;

    public void setUserName(String userName){
        profileName.setText(userName);
    }
    public void saveOnAction(ActionEvent actionEvent) {
        System.out.println("Name : " + name.getText()+ " Surname : " + surname.getText());

    }

    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/namesurnamejavafx/loginView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) profileName.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));



    }


}
