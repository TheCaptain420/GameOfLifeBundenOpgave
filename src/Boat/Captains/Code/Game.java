package Boat.Captains.Code;

public class Game {
    public static void main(String[] args) {



        Cell[][] gamesArray = new Cell[10][10];

        GoThrough goThrough = new GoThrough(gamesArray);
        goThrough.updateState();


    }
}
