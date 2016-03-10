package Pieces;

/**
 * 1. All pieces will be observed
 * 观察所有棋子
 *
 * 2. Responsible for new pieces and delete pieces
 * 新建和删除棋子
 */
public class PiecesManager {
    int numTrue = 0;
    int numFalse = 0;


    // ---------------------------------- Ctor Start ------------------------------------------

    PiecesManager(){
        /*
         * Should be build before any pieces build
         */
        numTrue = 0;
        numFalse = 0;
    }

    // ---------------------------------- Ctor End --------------------------------------------

    public AbstractPieces addPieces(AbstractPieces kindOfPiece, boolean camp){
        // TODO
        AbstractPieces newPiece = kindOfPiece;

        if (camp){
            numTrue++;
        }
        else
            numFalse++;
        return newPiece;
    }

    public void delete(AbstractPieces pieces){
        // TODO
    }
    // ------------------------------ accessor start --------------------------------------------

    public int getNumFalse() {
        return numFalse;
    }

    public int getNumTrue() {
        return numTrue;
    }

    public int getNumTotally(){
        return numFalse + numTrue;
    }

    public void setNumFalse(int numFalse) {
        this.numFalse = numFalse;
    }

    public void setNumTrue(int numTrue) {
        this.numTrue = numTrue;
    }

    public void initNumsOfPieces(){
        /*
         * execute when game start
         */
    }
    // ------------------------------ accessor end --------------------------------------------

}
