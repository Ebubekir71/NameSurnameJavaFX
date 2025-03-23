package com.example.namesurnamejavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private Label show;

    public void showNameSurname(ActionEvent actionEvent) {
        show.setText("Hello " + textField.getText());


    }
}