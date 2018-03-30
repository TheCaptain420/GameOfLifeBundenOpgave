package Boat.Captains.GUI;

import Boat.Captains.Code.Cell;
import Boat.Captains.Code.GettableInfo;
import Boat.Captains.Code.GoThrough;
import Boat.Captains.Code.PrintInConsole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class GUIController {
    @FXML
    private Button btn_next;

    @FXML
    private Button btn_start;

    @FXML
    private Button btn_stop;

    @FXML
    private TextArea theTextArea;

    @FXML
    private Button btn_startthewholething;


    private PrintInConsole printInConsole = new PrintInConsole();

    //Fortæller at goth skal gå igennem gamesarray


    Cell[][] gamesArray;
    GoThrough goThrough = new GoThrough(this.gamesArray);
    //Functer som en slags database
    GettableInfo gettableInfo = new GettableInfo();

    @FXML
    private void handleButtonAction(ActionEvent e) {
        if(e.getSource()==btn_startthewholething){

            //Kalder databasen
            this.gamesArray = gettableInfo.creatingTheArray();
            //Fylder gamesArray op.
            gettableInfo.fillACell(5,5);
            gettableInfo.fillACell(2,5);
            gettableInfo.fillACell(4,4);
            gettableInfo.fillACell(5,6);
            theTextArea.setText("hello");

        }

        if (e.getSource()==btn_next){
            //går igennem den.

            goThrough.updateState();
        }

    }



}
