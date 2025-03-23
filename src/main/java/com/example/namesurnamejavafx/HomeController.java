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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/namesurnamejavafx/loginView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) welcomeLabel.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));

    }

    public void goToProfile(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/namesurnamejavafx/profileView.fxml"));
        Parent root = loader.load();

        ProfileController profileController = loader.getController();
        String userName = welcomeLabel.getText().replace("Hello", "");
        profileController.setUserName(userName);

        Stage stage = (Stage) welcomeLabel.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));

    }
}
