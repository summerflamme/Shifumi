module fr.summerdev.shifumi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens fr.summerdev.shifumi to javafx.fxml;
    exports fr.summerdev.shifumi;
}