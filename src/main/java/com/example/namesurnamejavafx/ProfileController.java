package com.example.namesurnamejavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProfileController {
    @FXML
    private Label profileName;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private Label information;

    public void setUserName(String userName){
        profileName.setText(userName);
    }
    public void saveOnAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Name : " + name.getText()+ " Surname : " + surname.getText());
        String nameText = name.getText();
        String surnameText = surname.getText();
        File file = new File("userInformation.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.write("\nName: "+nameText+"\nSurname: "+surnameText);
        writer.close();


        information.setText("Information successfully saved");
    }

    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/namesurnamejavafx/loginView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) profileName.getScene().getWindow();
        stage.setScene(new Scene(root, 400, 300));



    }


}
