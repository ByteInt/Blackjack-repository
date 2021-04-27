import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    @FXML
    private Button Start= new Button();

    @FXML
    private Pane IntroMenu = new Pane();
    public Controller(){
    }

    @FXML
    private void initialize(){
        System.out.println("Initialized");
    }
    public void StartClicked(MouseEvent mouseEvent) {
        IntroMenu.setVisible(false);
        IntroMenu.setDisable(true);
    }
}
