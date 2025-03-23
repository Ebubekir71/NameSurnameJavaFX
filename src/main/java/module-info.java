module com.example.namesurnamejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.namesurnamejavafx to javafx.fxml;
    exports com.example.namesurnamejavafx;
}