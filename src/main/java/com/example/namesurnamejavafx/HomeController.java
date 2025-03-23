package com.example.namesurnamejavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Label welcomeLabel;

    public void setUserName(String userName) {
        welcomeLabel.setText("Hello " +userName);
    }

    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) welcomeLabel.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));

    }
}
