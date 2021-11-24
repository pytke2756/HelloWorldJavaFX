package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label welcomeText;
    public TextField nevBevitelMezo;

    public void helloClick(ActionEvent actionEvent) {
        String nev = nevBevitelMezo.getText();
        Alert felugroAblak = new Alert(Alert.AlertType.NONE, "Hello "+nev, ButtonType.OK);
        /*felugroAblak.setContentText("Hello "+nev);
        felugroAblak.getButtonTypes().add(ButtonType.OK)*/
        felugroAblak.show();

    }
}
