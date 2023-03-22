module ru.netology.maventask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.netology.maventask1 to javafx.fxml;
    exports ru.netology.maventask1;
}