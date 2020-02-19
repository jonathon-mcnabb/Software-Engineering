import java.util.ArrayList;
/**
 * Gamer class. 
 *  
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 * 
 * Purpose. Extend Person class for Gamer behaviors
 */

public class Gamer extends Person{
	
	private String favoriteGame; // gamers favorite game
	private int hoursPlayedANight; // number of hours the favorite game is played a night
	private int currentQuestion = 0; // set up currentQuestion index
	private int currentAnswer = 0; // set up currentAnswer index
	// 3 questions to ask gamer
	private String[] questions = {"Have you seen the new Sonic movie?", "What is your favorite game?", "What do you think of the person behind me?"};
	private String[] answers = new String[3]; // allocate space for 3 question strings
	
	/**
	 * Constructor to set up a gamer
	 * calls super class constructor (Person) to pass myName and occupation
	 * @param myName : passed to super class constructor
	 * @param occupation : passed to super class occupation
	 * @param favoriteGame: assigned to gamer class favoriteGame
	 * @param hoursPlayedANight : assigned to gamer class hoursPlayedANight
	 */
	public Gamer(String myName, String occupation, String favoriteGame, int hoursPlayedANight) {
		// parent class constructor
		super(myName, occupation);
		// assigns game class instance variables
		this.favoriteGame = favoriteGame;
		this.hoursPlayedANight = hoursPlayedANight;
		// assigns answers array values based on initialized variables
		answers[0] = "My favorite game is " + favoriteGame + ".";
		answers[1] = "I played " + hoursPlayedANight + " hours of " + favoriteGame + " last night.";
		answers[2] = "Yes, Sonic looks so bad now.";
	}

	/**
	 * Overrides parent class method WhatDoYouDo()
	 * calls parent class method
	 * Prints gamer specifc string
	 */
	@Override
	public void whatDoYouDo() {
		// TODO Auto-generated method stub
		super.whatDoYouDo();
		System.out.println("I fight for the pixels!");
	}

	/**
	 * Implements abstract method askQuestion()
	 * Rotates through questions
	 */
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		System.out.println(questions[currentQuestion]);
		currentQuestion = ++currentQuestion % 3;
	}

	/**
	 * Implements abstract method answerQuestion()
	 * Rotates through answers
	 */
	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		System.out.println(answers[currentAnswer]);
		currentAnswer = ++currentAnswer % 3;
	}

}
