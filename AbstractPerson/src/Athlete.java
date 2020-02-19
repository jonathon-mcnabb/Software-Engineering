/**
 * Athlete class. 
 *  
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 * 
 * Purpose. Extend Person class for Athlete behaviors
 */

public class Athlete extends Person {

	private String favoriteSport; // athletes favorite sport
	private String favoriteTeam; // athletes favorite team
	private String answer; // variable for athletes answer
	private String question = "What job do you want to have?"; // instance variable for athletes question
	
	/**
	 * Constructor to set up an athlete
	 * calls super class constructor (Person) to pass myName and occupation
	 * @param myName : passed to super class constructor
	 * @param occupation : passed to super class occupation
	 * @param favoriteSport: assigned to athlete class favoriteSport
	 * @param favoriteTeam : assigned to athlete class favoriteTeam
	 */
	public Athlete(String myName, String occupation, String favoriteSport, String favoriteTeam) {
		// calls super class constructor
		super(myName, occupation);
		// intitalizes instance variables
		this.favoriteSport = favoriteSport;
		this.favoriteTeam = favoriteTeam;
		// gives answer a value
		answer = "My favorite job is taxodermy";
	}
	
	/**
	 * Overrides parent class method WhatDoYouDo()
	 * calls parent class method
	 * Prints athlete specific string
	 */
	@Override
	public void whatDoYouDo() {
		// TODO Auto-generated method stub
		super.whatDoYouDo();
		System.out.println("I play " + favoriteSport + " for " + favoriteTeam + ".");
	}
	
	/**
	 * Implements abstract method askQuestion()
	 * Prints question
	 */
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println(question);
	}

	/**
	 * Implements abstract method answerQuestion()
	 * Prints answer
	 */
	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println(answer);
	}

}
