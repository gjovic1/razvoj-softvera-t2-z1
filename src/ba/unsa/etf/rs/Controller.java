package ba.unsa.etf.rs;

import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;
    public Button btnChg;
    public void sayHello(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
}
