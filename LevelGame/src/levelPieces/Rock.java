package levelPieces;

import gameEngine.Drawable;

/**
 * Defines behaviors for Rock
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 *
 */

public class Rock implements Drawable{
	
	// Stores symbol
	private char symbol;

	/**
	 * Constructor for Rock
	 * 
	 * calls super
	 * 
	 * @param symbol defines the print symbol for Rock
	 */
	public Rock(char symbol) {
		super();
		this.symbol = symbol;
	}
	
	/**
	 * Draws the symbol on the board
	 * 
	 */
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(symbol);
		
	}

}
