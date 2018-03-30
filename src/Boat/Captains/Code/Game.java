package Boat.Captains.Code;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {

        //Functer som en slags database
        GettableInfo gettableInfo = new GettableInfo();
        //Kalder databasen
        Cell[][] gamesArray = gettableInfo.creatingTheArray();
        //Fylder gamesArray op.
        gettableInfo.fillACell(5,5);
        gettableInfo.fillACell(2,5);
        gettableInfo.fillACell(4,4);
        gettableInfo.fillACell(5,6);



        //Fortæller at goth skal gå igennem gamesarray
        GoThrough goThrough = new GoThrough(gamesArray);
        //går igennem den.
        goThrough.updateState();


    }
}
