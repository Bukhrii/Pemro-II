module praktikum6.praktikum6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens praktikum6.praktikum6 to javafx.fxml;
    exports praktikum6.praktikum6;
}