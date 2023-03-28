module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pl.camp.it.javafx to javafx.fxml;
    opens pl.camp.it.javafx.controllers to javafx.fxml;
    exports pl.camp.it.javafx;
}