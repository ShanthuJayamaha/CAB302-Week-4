module org.example.week_4_tutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week_4_tutorial to javafx.fxml;
    exports org.example.week_4_tutorial;
}