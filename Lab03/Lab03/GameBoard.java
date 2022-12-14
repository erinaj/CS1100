import java.util.ArrayList;
/**
 * Write a description of class GameBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard
{
   // instance variables - replace the example below with your own
    private ArrayList<PlayerPiece> gameList;
    /**
     * Constructor for objects of class GameBoard
     */
    public GameBoard()
    {
        // initialise instance variables
        gameList = new ArrayList<PlayerPiece>(20); //max 20 pieces on board
    }
    //method to add a piece to the board
    //accepts the piece to add
    public void addPiece(PlayerPiece p)  {
       if(gameList.add(p)) {
           System.out.println("added piece");
           this.printBoard();
        }   else {
        System.out.println("could not add piece");
        }
    }
    public void printBoard() {
        //counter while we do for each item in the list to print
        int i = 0;
        for(PlayerPiece item: gameList) {
        
            i++;
            //print the piece
            System.out.println("Piece " + i + ":");
            System.out.println(item.getCurrentHealth() +
                    "/" + item.getMaxHealth() + " HP");
            System.out.println("Location: (" + item.getLocX()
                    + ", " + item.getLocY() + ")");
        }
    }
}
