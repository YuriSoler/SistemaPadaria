package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Home extends Application {

    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();
        Scene scene = new Scene(mainPane, 1024, 700);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
