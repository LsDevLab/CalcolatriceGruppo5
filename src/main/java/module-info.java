module com.example.calcolatricegruppo5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcolatricegruppo5 to javafx.fxml;
    exports com.example.calcolatricegruppo5;
}