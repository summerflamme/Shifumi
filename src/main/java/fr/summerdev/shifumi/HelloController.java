package fr.summerdev.shifumi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Pierre!" + "Feuill!" + "Ciseaux");
    }
}