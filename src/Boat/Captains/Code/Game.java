package Boat.Captains.Code;

public class Game {
    public static void main(String[] args) {
        int lengthSide = 10;
        int lengthUpDown= 10;

        Cell[][] gamesArray = new Cell[10][10];

        gamesArray[5][5] = new Cell();
        gamesArray[4][5] = new Cell();
        gamesArray[4][4] = new Cell();


        //Her checker den om alle er hvor tingene er.
        for (int i = 0; i < (lengthSide-1) ; i++) {
            for (int j = 0; j < (lengthUpDown-1) ; j++) {
                System.out.println("TSM");
                if(gamesArray[i][j].isAlive()) {

                    //bundrækken (iforhold til)
                    gamesArray[+i][+j].setLivingNeighbours(+1);
                    gamesArray[i][+j].setLivingNeighbours(+1);
                    gamesArray[-i][+j].setLivingNeighbours(+1);
                    //Midter rækken (iforhold til)
                    gamesArray[+i][j].setLivingNeighbours(+1);
                    gamesArray[-i][j].setLivingNeighbours(+1);
                    //toprækken (iforhold til)
                    gamesArray[+i][-j].setLivingNeighbours(+1);
                    gamesArray[i][-j].setLivingNeighbours(+1);
                    gamesArray[-i][-j].setLivingNeighbours(+1);
                    }



            }
        }


    }
}
