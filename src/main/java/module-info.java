module com.example.examen6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examen6 to javafx.fxml;
    exports com.example.examen6;
}