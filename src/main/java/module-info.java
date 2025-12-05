module com.example.life_insurance {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.life_insurance to javafx.fxml;
    exports com.example.life_insurance;
}