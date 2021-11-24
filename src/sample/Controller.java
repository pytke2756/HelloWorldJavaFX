package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label eletKorLabel;
    @FXML
    private TextField nevBevitelMezo;
    @FXML
    private Spinner<Integer> eletkorBevitel;
    @FXML
    private ListView<Ember> emberLista;

    public void felvetelClick(){
        String nev = nevBevitelMezo.getText();
        int eletkor = eletkorBevitel.getValue();
        Ember ember = new Ember(nev, eletkor);
        emberLista.getItems().add(ember);
    }

    public void helloClick(ActionEvent actionEvent) {
        String nev = nevBevitelMezo.getText();
        Alert felugroAblak = new Alert(Alert.AlertType.NONE, "Hello "+nev, ButtonType.OK);
        /*felugroAblak.setContentText("Hello "+nev);
        felugroAblak.getButtonTypes().add(ButtonType.OK)*/
        felugroAblak.showAndWait();
        eletKorLabel.setText("Hello");

    }
}
