package Boat.Captains.Code;

public class Cell {
    int livingNeighbours;
    boolean alive = false;

    public Cell(char alive){

        if(alive =='a'){this.alive=true;
            //System.out.println("Cell created");
            }
        if(alive =='d'){this.alive=false;}

    }

    public void update(){

        if(alive ==true){
            //survival
            if(livingNeighbours==2){
                this.alive = true;
            }
            //survival
            else if (livingNeighbours == 3){
                this.alive = true;
            }
            //death
            else {
                this.alive = false;
            }

        }

        if(alive == false) {
            //birth
            if (livingNeighbours == 3) {
                this.alive = true;
            }

        }

        this.livingNeighbours = 0;


    }


    //Gettere og settere

    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours += livingNeighbours;
    }
    void resetLivingNeighbours(){
        this.livingNeighbours = 0;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
