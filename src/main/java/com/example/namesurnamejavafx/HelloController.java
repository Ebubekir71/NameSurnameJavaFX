package com.example.namesurnamejavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField textFieldName;
    @FXML
    private Label show;
    @FXML
    private TextField textFieldSurname;

    public void showNameSurname(ActionEvent actionEvent) {
        show.setText("Hello " + textFieldName.getText() + " " +textFieldSurname.getText());


    }
}