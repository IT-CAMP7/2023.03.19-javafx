package pl.camp.it.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button1 = new Button("Przycisk");

        button1.setOnAction(ae -> System.out.println("cos dziala !!!"));

        Button button2 = new Button("Przycisk 2");

        button2.setOnAction(ae -> System.out.println("kliknieto w przycisk !!"));

        Button button3 = new Button("Przycisk 3");
        Button button4 = new Button("Przycisk 4");
        Button button5 = new Button("Przycisk 5");

        FlowPane pane = new FlowPane();
        pane.getChildren().add(button1);
        pane.getChildren().add(button2);
        pane.getChildren().add(button3);
        pane.getChildren().add(button4);
        pane.getChildren().add(button5);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.setTitle("Aplikacja");
        stage.setHeight(300);
        stage.setWidth(400);
        //stage.setResizable(false);
        stage.show();
    }
}
