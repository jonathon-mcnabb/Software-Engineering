package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

/**
 * Defines behaviors for SuperShinyStar Gamepiece
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 *
 */
public class SuperShinyStar extends GamePiece implements Moveable {
	
	/**
	 * Constructor for SuperShinyStar
	 * 
	 * calls super
	 * 
	 * @param symbol defines the print symbol for fly
	 * @param location, initializes the flys location
	 */
	public SuperShinyStar(char symbol, int location) {
		super(symbol, location);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Handles interaction between player and game piece
	 * 
	 * @param pieces is an array of drawable pieces
	 * @param playerLocation is the players current location
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// TODO Auto-generated method stub
		if(super.getLocation()==playerLocation) {
			return InteractionResult.GET_POINT;
		}
		return InteractionResult.NONE;
	}

	/**
	 * Finds the next position of the super shiny star
	 * and passes that value to the super
	 * 
	 * @param gameBoard is a board of game pieces
	 * @param playerLocation is the current players location
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// come up with random nums until we have a location where a other piece is not
		// move to this location
		int randomPosition;
		do{
			// generate new random num
			double randomNumber = Math.random();
			// size up to game board size
			randomPosition = (int) (randomNumber * gameBoard.length);
		}while(gameBoard[randomPosition] != null); // keep trying until there is an open spot
		// set location to new location. 
		super.setLocation(randomPosition);
	}


}
