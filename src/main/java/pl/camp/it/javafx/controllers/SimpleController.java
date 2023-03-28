package pl.camp.it.javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SimpleController {

    @FXML
    TextField poleTekstowe;

    @FXML
    public void buttonClick(ActionEvent actionEvent) {
        System.out.println("Click !!!");

        if(actionEvent.getSource() instanceof Button) {
            System.out.println("Kliknieto w przycisk !!");
        } else if(actionEvent.getSource() instanceof CheckBox) {
            System.out.println("Kliknieto w checkbox !!");
        }
    }

    @FXML
    public void readTextField() {
        System.out.println(poleTekstowe.getText());
    }
}
