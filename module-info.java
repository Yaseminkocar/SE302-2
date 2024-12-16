module com.example.se30222 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.se30222 to javafx.fxml;
    exports com.example.se30222;
}