package Boat.Captains.Code;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {

        //Functer som en slags database
        GettableInfo gettableInfo = new GettableInfo();



        //Fortæller at goth skal gå igennem gamesarray
        GoThrough goThrough = new GoThrough();
        //går igennem den.
        goThrough.updateState(Singleton.getGamesArray());


    }
}
