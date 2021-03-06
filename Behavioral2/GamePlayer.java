/**
* GamePlayer.java
*
* A simple game player class
*/

public class GamePlayer
{
    // You may add attributes as you see fit
	
	public GamePlayer()
	{
	    // Initialize attributes as necessary
	}
	
	public void setup(int boardSize, int moveSelectionTime)
	{
	    // Select the appropriate method of play based on the passed in arguments
        
        if(boardSize < 20)
            TreeSearch.execute();
        else if(boardSize >= 20 && moveSelectionTime >= 60)
            Minimax.execute();
        else
            MonteCarlo.execute();
	}
	
	public void selectMove()
	{
	    // A dummy method.  Your code simply needs to print to the console
		// "I'm making a move using the _______ AI."
	}
}
	