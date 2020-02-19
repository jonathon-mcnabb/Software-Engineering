package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Defines behaviors for William Hoff Gamepiece
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 *
 */
public class WilliamHoff extends GamePiece {

	/**
	 * Constructor for William Hoff
	 * 
	 * calls super
	 * 
	 * @param symbol defines the print symbol for fly
	 * @param location, initializes the flys location
	 */
	public WilliamHoff(char symbol, int location) {
		super(symbol, location);
	}

	/**
	 * Handles interaction between player and game piece
	 * 
	 * @param pieces is an array of Drawable pieces
	 * @param playerLocation is the players current location
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(super.getLocation()==playerLocation) {
			// if piece location = player location print statement and advance
			System.out.println("\nYou found William Hoff!");
			return InteractionResult.ADVANCE;
		}
		return InteractionResult.NONE;
	}

}
