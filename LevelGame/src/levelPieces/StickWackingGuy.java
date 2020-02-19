package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Defines behaviors for StickWackingGuy Gamepiece
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 *
 */

public class StickWackingGuy extends GamePiece {

	/**
	 * Constructor for SticKWackingGuy. passes data to super. 
	 * 
	 * calls super
	 * 
	 * @param symbol is the game pieces symbol
	 * @param location is the initial piece location
	 */
	public StickWackingGuy(char symbol, int location) {
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
		if(super.getLocation()==playerLocation + 1) {
			// hit if the piece is at the player location
			return InteractionResult.HIT;
		}
		return InteractionResult.NONE;
	}
	
	

}
