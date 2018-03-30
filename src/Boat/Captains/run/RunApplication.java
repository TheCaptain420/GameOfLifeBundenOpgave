package Boat.Captains.run;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.sql.Connection;

public class RunApplication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Ved fejl slet næste linje
        //primaryStage.getIcons().add(new Image("files/f2u_squidward_dab_sticker_by_fluffybunny321-day9vfu.png"));
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/GUIScene.fxml"));//Henter vores gui fra sample.fxml        primaryStage.setTitle("Panteren!");
        primaryStage.setTitle("Game of life!");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }
}
