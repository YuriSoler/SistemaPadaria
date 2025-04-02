package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Sidebar;

import java.util.Objects;

public class Home extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Sidebar sidebar = new Sidebar();

        // Image imgIconStarbucks = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/iconSmall.png")));

        BorderPane mainPane = new BorderPane();
        mainPane.setLeft(sidebar);
        sidebar.setStyle("-fx-translate-y:60px");
        mainPane.setStyle("-fx-background-image: url('/view/img/backgroud.png')");
        Scene scene = new Scene(mainPane, 1024, 700);
        stage.setScene(scene);
        stage.setTitle("Starbucks");
       // stage.getIcons().add(imgIconStarbucks);
        stage.setMaximized(false);
        stage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
