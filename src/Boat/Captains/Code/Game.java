package Boat.Captains.Code;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {



        Cell[][] gamesArray = new Cell[10][10];
        ArrayList<Cell> cellArrayList = new ArrayList<>();

        //Creating the cells !!!HAS TO BE MOVED
        gamesArray[5][5] = new Cell('a');
        gamesArray[4][5] = new Cell('a');
        gamesArray[4][4] = new Cell('a');
        gamesArray[5][6] = new Cell('a');



        GoThrough goThrough = new GoThrough(gamesArray,cellArrayList);
        goThrough.updateState();


    }
}
