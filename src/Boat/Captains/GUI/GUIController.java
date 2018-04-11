package Boat.Captains.GUI;

import Boat.Captains.Code.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

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

    GettableInfo gettableInfo = new GettableInfo();

    Timer timer;




    //Cell[][] gamesArray = gettableInfo.creatingTheArray();

    GoThrough goThrough = new GoThrough();

    @FXML
    private void handleButtonAction(ActionEvent e) {
        if(e.getSource()==btn_startthewholething){
            //Kalder databasen
            //Fylder gamesArray op.
            goThrough.updateState(Singleton.getGamesArray());

            Singleton.makeCellAlive(5,5);
            Singleton.makeCellAlive(2,3);
            Singleton.makeCellAlive(3,4);
            Singleton.makeCellAlive(3,5);


            theTextArea.setText(printInConsole.printerinoInGui(Singleton.getGamesArray()));

        }

        if (e.getSource()==btn_next){
            //går igennem den.

            goThrough.updateState(Singleton.getGamesArray());
            theTextArea.setText(printInConsole.printerinoInGui(Singleton.getGamesArray()));
        }


        if(e.getSource()==btn_start){

        }



        if(e.getSource()==btn_stop){

        }

    }



}
