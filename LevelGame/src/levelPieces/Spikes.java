package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


/**
 * Defines behaviors for Spike Gamepiece
 * 
 * calls super
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 *
 */

public class Spikes extends GamePiece {

	/**
	 * Constructor for spikes. passes data to super. 
	 * 
	 * @param symbol is the game pieces symbol
	 * @param location is the initial piece location
	 */
	public Spikes(char symbol, int location) {
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
		if(super.getLocation() == playerLocation) {
			// kill if spike location = player location
			return InteractionResult.KILL;
		}
		return InteractionResult.NONE;
	}

}
