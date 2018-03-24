package Boat.Captains.Code;

public class Cell {
    int livingNeighbours;
    boolean alive = false;
    boolean almostAlive ;

    Cell(){

        alive=alive;
    }

    public void update(int livingNeighboursPar){

        if(alive ==true){
            //survival
            if(livingNeighboursPar==2){
                this.alive = true;
            }
            //survival
            else if (livingNeighboursPar == 3){
                this.alive = true;
            }
            //death
            else {
                this.alive = false;
            }

        }

        if(alive == false) {
            //birth
            if (livingNeighboursPar == 3) {
                this.alive = true;
            }

        }


    }


    //Gettere og settere

    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
