package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {

    public Label welcomeText;

    public void helloClick(ActionEvent actionEvent) {
        welcomeText.setText("Köszöntöm a 14.S osztályt az elsü JavaFx gyakorlaton!");
    }
}
