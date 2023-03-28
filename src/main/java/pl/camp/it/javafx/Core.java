package pl.camp.it.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.camp.it.javafx.model.User;

import java.io.IOException;

public class Core {

    private User user = null;
    private Stage stage = null;
    private static final Core instance = new Core();
    private Core() {
    }

    public void changeScene(Pane pane) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource(pane.getPath()));
            this.stage.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public static Core getInstance() {
        return instance;
    }

    public enum Pane {
        LOGIN("/fxml/LoginPane.fxml"),
        USER("/fxml/UserPane.fxml");

        private final String path;

        Pane(String path) {
            this.path = path;
        }

        public String getPath() {
            return path;
        }
    }
}
