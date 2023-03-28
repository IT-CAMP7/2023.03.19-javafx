package pl.camp.it.javafx;

import javafx.application.Application;
import javafx.stage.Stage;

public class App3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Core.getInstance().setStage(stage);
        Core.getInstance().changeScene(Core.Pane.LOGIN);
        stage.setResizable(false);
        stage.setTitle("Logowanie");
        stage.show();
    }
}
