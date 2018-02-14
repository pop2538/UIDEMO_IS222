package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private lonigmodel model = new lonigmodel();
    //import object from scence builder
    @FXML
    private Label dbStatus;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.model.inDatabaseConnection()){
            this.dbStatus.setText("Connected to DB");
        }else{
            this.dbStatus.setText("Not Connect to DB");
        }

    }
}//class