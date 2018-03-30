package Boat.Captains.Code;

import java.util.ArrayList;
import java.util.Scanner;

public class GoThrough {

    //En klasse der går igennem arrayen for at checke hvormange der er i live og derefter ændrer deres state

    private Cell[][] gamesArray;

    int lengthSide = GettableInfo.lengthSide;
    int lengthUpDown = GettableInfo.lengthSide;

    private PrintInConsole printInConsole = new PrintInConsole();

    int counter=0;



    public GoThrough(Cell[][] gamesArray){
        this.gamesArray = gamesArray;
    }


    public void creation(Cell[][] gamesArrayet){
        //Sikrer sig at den kun bliver kørt en gang
        if(this.counter<1){

            //Fill array with dead cells
            for (int i = 0; i < lengthSide-1 ; i++) {
                for (int j = 0; j < lengthUpDown-1 ; j++) {
                    gamesArrayet[i][j]=new Cell('d');
                }
            }
            //Smider nogen nye Cells ind
            /*gamesArray[6][5] = new Cell('a');
            gamesArray[1][5] = new Cell('a');
            gamesArray[2][4] = new Cell('a');
            gamesArray[2][6] = new Cell('a');*/
            this.counter++;
        }else{
            System.out.println("--Creation has been run before-- ");
        }
    }
    public void updateState(){

        creation();

        //Printer i console

        printInConsole.printerino(gamesArray);


        //Her checker den om alle er hvor tingene er.
        for (int i = 0; i < (lengthSide-1) ; i++) {
            for (int j = 0; j < (lengthUpDown-1) ; j++) {
                if(gamesArray[i][j].isAlive()) {
                    try {
                        System.out.println("found cell at " + i + " : " + j);
                        //bundrækken (iforhold til)
                        gamesArray[i + 1][j + 1].setLivingNeighbours(+1);
                        gamesArray[i][j + 1].setLivingNeighbours(+1);
                        gamesArray[i - 1][j + 1].setLivingNeighbours(+1);
                        //Midter rækken (iforhold til)
                        gamesArray[i + 1][j].setLivingNeighbours(+1);
                        gamesArray[i - 1][j].setLivingNeighbours(+1);
                        //toprækken (iforhold til)
                        gamesArray[i + 1][j - 1].setLivingNeighbours(+1);
                        gamesArray[i][j - 1].setLivingNeighbours(+1);
                        gamesArray[i - 1][j - 1].setLivingNeighbours(+1);

                        System.out.println("Cell at " + i + " : " + j);
                        System.out.println(gamesArray[5][4].getLivingNeighbours());
                    }catch (ArrayIndexOutOfBoundsException e){
                        e.printStackTrace();
                    }
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

        Scanner scanner = new Scanner(System.in);
        String helloworld = scanner.next();
        if(helloworld.equals("0")){
            updateState();
        }
    }


}
