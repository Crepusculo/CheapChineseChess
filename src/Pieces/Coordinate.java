package Pieces;

public class Coordinate {
    private int x = 0;
    private int y = 0;

    // ---------------------------------- Ctor Start ------------------------------------------
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }


    // ---------------------------------- Ctor End --------------------------------------------

    // ------------------------------ accessor start --------------------------------------------

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public Coordinate getCoord() {
        return this;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    // ------------------------------- accessor end ---------------------------------------

}
