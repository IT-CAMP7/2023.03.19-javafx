package pl.camp.it.javafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pl.camp.it.javafx.Core;

public class UserPaneController {

    @FXML
    Label login;

    @FXML
    Label password;

    @FXML
    Label age;

    public void initialize() {
        this.login.setText(Core.getInstance().getUser().getLogin());
        this.password.setText(Core.getInstance().getUser().getPassword());
        this.age.setText(Core.getInstance().getUser().getAge() + "");
    }

    @FXML
    public void back() {
        Core.getInstance().setUser(null);
        Core.getInstance().changeScene(Core.Pane.LOGIN);
    }
}
