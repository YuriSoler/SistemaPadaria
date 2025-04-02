package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Sidebar;
import javafx.scene.image.Image;

import java.awt.*;

public class Cliente extends Application {

    public void start(Stage janela) throws Exception{

        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/starbucks.png"));

        Sidebar menuLateral = new Sidebar();

        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setLeft(menuLateral);

        Scene scene = new Scene (layoutPrincipal, 1024, 700);
        janela.setScene(scene);
        janela.setTitle("Starbucks");
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

