package Boat.Captains.Code;

public class GoThrough {

    //En klasse der går igennem arrayen for at checke hvormange der er i live og derefter ændrer deres state

    Cell[][] gamesArray;

    int lengthSide = GettableInfo.lengthSide;
    int lengthUpDown = GettableInfo.lengthSide;

    PrintInConsole printInConsole = new PrintInConsole();

    GoThrough(Cell[][] gamesArray){
        this.gamesArray = gamesArray;
    }

    void updateState(){


        //Fill array with dead cells
        for (int i = 0; i < lengthSide-1 ; i++) {
            for (int j = 0; j < lengthUpDown-1 ; j++) {
                gamesArray[i][j]=new Cell('d');
            }
        }

        gamesArray[5][5] = new Cell('a');
        gamesArray[4][5] = new Cell('a');
        gamesArray[4][4] = new Cell('a');
        gamesArray[5][6] = new Cell('a');


        //Printer i console
        printInConsole.printerino(gamesArray);


        //Her checker den om alle er hvor tingene er.
        for (int i = 0; i < (lengthSide-1) ; i++) {
            for (int j = 0; j < (lengthUpDown-1) ; j++) {
                if(gamesArray[i][j].isAlive()) {
                    System.out.println("found cell at "+ i +" : "+j);
                    //bundrækken (iforhold til)
                    gamesArray[i+1][j+1].setLivingNeighbours(+1);
                    gamesArray[i][j+1].setLivingNeighbours(+1);
                    gamesArray[i-1][j+1].setLivingNeighbours(+1);
                    //Midter rækken (iforhold til)
                    gamesArray[i+1][j].setLivingNeighbours(+1);
                    gamesArray[i-1][j].setLivingNeighbours(+1);
                    //toprækken (iforhold til)
                    gamesArray[i+1][j-1].setLivingNeighbours(+1);
                    gamesArray[i][j-1].setLivingNeighbours(+1);
                    gamesArray[i-1][j-1].setLivingNeighbours(+1);

                    System.out.println("Cell at "+ i +" : "+j);
                    System.out.println(gamesArray[5][4].getLivingNeighbours());

                }

            }
        }
        //her gør den dem i live.
        for (int i = 0; i <lengthSide-1 ; i++) {
            for (int j = 0; j <lengthUpDown-1 ; j++) {
                gamesArray[i][j].update();

            }
        }
        //Printer igen
        printInConsole.printerino(gamesArray);


    }


}
