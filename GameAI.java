/**
 * Team One
 * Gomoku
 * CSCE 320 - Spring 2015
 * 3/16/2015
 * Java - JVM
 * Sources:
 * 
 * Revisions:
 * 3/14/2015 - Class created by Joseph Bowley.
 */
public class GameAI {
    private GameBoard board;
    
    /**
     * Game AI Constructor
     */
    public GameAI()
    {
        
    }
    
    /**
     * Method to start the AI
     */
    public void playGame()
    {
        
    }
    
    /**
     * Makes a move in the game board as an opponent player.
     * @param x
     * @param y 
     */
    public void makeMove(int x, int y)
    {
        board.makeMove(x, y, false);
    }
}
