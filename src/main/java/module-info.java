module project.oop.mastermindproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens project.oop.mastermindproject to javafx.fxml;
    exports project.oop.mastermindproject;
}