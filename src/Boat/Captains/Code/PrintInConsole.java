package Boat.Captains.Code;

import static Boat.Captains.Code.GettableInfo.lengthSide;
import static Boat.Captains.Code.GettableInfo.lengthUpDown;

public class PrintInConsole {

    //Klasse der printer hele skidtet i consolen

    public void printerino(Cell[][] gamesArray){
        for (int i = 0; i < lengthSide-1 ; i++) {
            for (int j = 0; j <(lengthUpDown-1) ; j++) {
                if (gamesArray[i][j].isAlive()){System.out.print("X ");}
                else { System.out.print("O "); }
            }
            System.out.println(" ");
        }
    }


    public String printerinoInGui(Cell[][] gamesArray){

        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < lengthSide-1 ; i++) {
            for (int j = 0; j <(lengthUpDown-1) ; j++) {
                if (gamesArray[i][j].isAlive()){stringBuilder.append("X ");}
                else { stringBuilder.append("O "); }
            }
            stringBuilder.append("\n");
        }



        String finalString = stringBuilder.toString();
        return finalString;
    }
}
