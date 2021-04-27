import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
//This file is for running. Run the application below
public class Interface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        //AnchorPane root = fxmlLoader.load(new FileInputStream("D:/学习/Java/Project/src/Interface.fxml"));
        URL url = fxmlLoader.getClassLoader().getResource("Interface.fxml");
        fxmlLoader.setLocation(url);
        AnchorPane root = (AnchorPane) fxmlLoader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Blackjack");
        primaryStage.show();
    }
}
