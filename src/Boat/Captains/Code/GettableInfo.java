package Boat.Captains.Code;

public class GettableInfo {
    //En klasse der bare indeholder noget info andre klasser kan hente
    static int lengthSide = 10;
    static int lengthUpDown= 10;

    private Cell[][] gamesArray = new Cell[lengthSide][lengthUpDown];

    public Cell[][] creatingTheArray(){
        return  gamesArray;
    }


    public void fillACell(int a, int b){
        if(a<lengthSide && b<lengthUpDown) {
            gamesArray[a][b] = new Cell('a');
        }else{
            System.out.println("---Failure, the cell youve tried to create is out of bounds.---");
        }
    }

}
