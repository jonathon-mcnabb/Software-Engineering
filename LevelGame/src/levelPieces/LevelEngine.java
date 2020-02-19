package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.Moveable;

/**
 * Framework for LevelEngine. 
 * Creates new boards, updates levels, updates board, and manages pieces. 
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini

 */

public class LevelEngine {
	
	// drawable array to store the board
	private Drawable[] currentBoard;
	// stores current level
	private int currentLevel;

	/**
	 * constructor for LevelEngine. Calls super class constructor. 
	 */
	public LevelEngine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * sets up the board based on the current level (levelNum)
	 * @param levelNum
	 */
	public void createLevel(int levelNum) {
		
		// set currentLevel
		this.currentLevel = levelNum;
		
		// decides which board to load
		switch(levelNum) {
			case(1): 
				// board for level 1
				currentBoard = new Drawable[]{new Spikes('^', 0), null, new Spikes('^', 2), new SuperShinyStar('*', 3), new Spikes('^', 4), new Fly('~', 5), new Spikes('^', 6), new StickWackingGuy('\\', 7), new Spikes('^', 8), null, null, null, new SuperShinyStar('*', 12), new SuperShinyStar('*', 13)};
				break;
			case(2): 
				// board for level 2
				currentBoard = new Drawable[] {null, new StickWackingGuy('\\', 1), null, null, new Spikes('^', 4), new Rock('0'), null, new WilliamHoff('?', 7)};
				break;
		}
		
	}
	
	/**
	 * Creates new board based on new piece locations
	 */
	public void updateLevel() {
		// allocates space for new board
		Drawable[] newBoard = new Drawable[currentBoard.length];
		// loops through each piece in current board
		for(Drawable piece : currentBoard) {
			// if the piece is of type GamePiece
			if(piece != null) {
				// moveIt the the new location
				GamePiece temp = (GamePiece)piece;
				newBoard[temp.getLocation()] = piece;
			}
		}
		currentBoard = newBoard;
	}

	/***
	 * returns the current board
	 * 
	 */
	public Drawable[] getBoard() {
		return currentBoard;
	}

	/**
	 * 
	 * returns list of all movable objects on the board
	 */
	public ArrayList<Moveable> getMovingPieces() {
		
		// allocates new space
		ArrayList<Moveable> moveablePieces = new ArrayList<Moveable>();
		
		// loops through objects in currentBoard
		for(Drawable d: currentBoard) {
			// if its of type movable
			if(d instanceof Moveable ) {
				// add it to the list
				moveablePieces.add((Moveable)d);
			}
		}
		
		return moveablePieces;
	}

	/**
	 * returns list of all pieces that have iteractions
	 * 
	 */
	public ArrayList<GamePiece> getInteractingPieces() {
		// allocates space
		ArrayList<GamePiece> interactingPieces = new ArrayList<GamePiece>();
		// loops through all pieces in board
		for(Drawable piece : currentBoard) {
			if(piece != null && (piece instanceof GamePiece) ) {
				// adds to list if not null
				interactingPieces.add((GamePiece)piece);
			}
		}
		
		return interactingPieces;
	}

	/**
	 * returns what the players start location should be based on the current level
	 * can be extended for future levels
	 */
	public int getPlayerStartLoc() {
		// switch based on current level
		switch(this.currentLevel) {
			case(1):
				return 1;
			case(2):
				return 0;
			default:
				return 0;
		}
		
	}
	
	

}
