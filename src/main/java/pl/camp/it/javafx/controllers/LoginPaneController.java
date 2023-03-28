package pl.camp.it.javafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import pl.camp.it.javafx.Core;
import pl.camp.it.javafx.model.User;
import java.util.Random;

public class LoginPaneController {

    @FXML
    TextField login;

    @FXML
    PasswordField password;

    @FXML
    public void authenticate() {
        String login = this.login.getText();
        String password = this.password.getText();

        if("admin".equals(login) && "admin".equals(password)) {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setAge(new Random().nextInt(100));
            Core.getInstance().setUser(user);

            Core.getInstance().changeScene(Core.Pane.USER);
        }

        if(!"admin".equals(login)) {
            this.login.setStyle("-fx-background-color: #FF4444");
        } else {
            this.login.setStyle("-fx-background-color: #FFFFFF");
        }

        if(!"admin".equals(password)) {
            this.password.setStyle("-fx-background-color: #FF4444");
        } else {
            this.password.setStyle("-fx-background-color: #FFFFFF");
        }
    }
}
