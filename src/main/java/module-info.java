module com.example.swemwbs {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;

    opens com.example.swemwbs to javafx.fxml;
    exports com.example.swemwbs;
}