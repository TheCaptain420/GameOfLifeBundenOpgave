package Boat.Captains.Code;

import static Boat.Captains.Code.GettableInfo.lengthSide;
import static Boat.Captains.Code.GettableInfo.lengthUpDown;

public class Singleton {
    //Vær stolt;D


    protected static Cell[][] gamesArray = new Cell[10][10];

    public static void makeCellAlive(int a,int b){
        if(a<lengthSide && b<lengthUpDown) {
            gamesArray[a][b] = new Cell('a');
        }else{
            System.out.println("---Failure, the cell youve tried to create is out of bounds.---");
        }

    }

    public static Cell[][] getGamesArray(){
        return gamesArray;
    }

}
