package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

import java.lang.Math;


/**
 * Defines behaviors for Fly Gamepiece
 * 
 * @author Jonathon McNabb	
 * @author Carter Pasqaulini
 *
 */

public class Fly extends GamePiece implements Moveable {
	
	// Keeps track of flys motion
	private boolean movingRight;

	/**
	 * Constructor for Fly
	 * 
	 * @param symbol defines the print symbol for fly
	 * @param location, initializes the flys location
	 */
	public Fly(char symbol, int location) {
		// passes params to super constructor
		super(symbol, location);
		// starts the flying moving right
		movingRight = true;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Finds the next position of the fly
	 * and passes that value to the super
	 * 
	 * @param gameBoard is a board of game pieces
	 * @param playerLocation is the current players location
	 */
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		int setPosition = super.getLocation();
			do{
				// if we are moving right
				if(movingRight) {
					// if the position is at the end of the game board
					if(setPosition == gameBoard.length-1) {
						// begin moving left 
						movingRight = false;
						setPosition--;
					}
					else {
					// move right
					setPosition++;
					}
				}
				else {
					// if we are at the far left of the board
					if(setPosition == 0) {
						// begin moving right
						movingRight = true;
						setPosition++;
					}
					else {
						// move left
						setPosition--;
					}
				}
				
			// continue to search until an open position is found		
			}while(gameBoard[setPosition] != null);
			
			// set location to checked value
			super.setLocation(setPosition);
	

	}
	
	/**
	 * Handles interaction between player and game piece
	 * 
	 * @param pieces is an array of drawable pieces
	 * @param playerLocation is the players current location
	 */
	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		// If the distance between is 2
		if(Math.abs(playerLocation - super.getLocation()) == 2)  {
			// give us a buzz
			System.out.println("BBBzbbzbzbzzzzzzzbbzbbbzzz");
			return InteractionResult.NONE;
		}
		// no buzz for you
		return InteractionResult.NONE;
	}

}
