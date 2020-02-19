import java.util.Random;
/**
 *  Nerd class. 
 *  
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 * 
 * Purpose. Extend Person class for Nerd behaviors
 */

public class Nerd extends Person {

	private String favoriteSubject; // the nerds favorite subject
	private boolean wearsGlasses; // true if nerd wears glasses
	// three questions for nerd
	private String[] questions = {"Do you know the difference between the quadratic formula and pythagorean's theorem?", "What's your favorite color of plaid?", "How many friends do you have?"};
	private String[] answers = new String[3]; // allocates space for 3 strings
	
	/**
	 * Constructor to set up an athlete
	 * calls super class constructor (Person) to pass myName and occupation
	 * @param myName : passed to super class constructor
	 * @param occupation : passed to super class occupation
	 * @param favoriteSubject: assigned to nerd class favoriteSubject
	 * @param wearsGlasses : assigned to nerd class wearsGlasses
	 */
	public Nerd(String myName, String occupation, String favoriteSubject, boolean wearsGlasses) {
		super(myName, occupation);
		this.favoriteSubject = favoriteSubject;
		this.wearsGlasses = wearsGlasses;
		answers[0] = "My favorite subject is " + favoriteSubject + ".";
		answers[1] = "No, you.";
		answers[2] = "My easiest class was astrophysics 5.";
	}
	
	/**
	 * Overrides parent class method WhatDoYouDo()
	 * calls parent class method
	 * Prints nerd specifc string
	 */
	@Override
	public void whatDoYouDo() {
		// TODO Auto-generated method stub
		super.whatDoYouDo();
		System.out.println("I have big brain.");
	}
	
	/**
	 * Implements abstract method askQuestion()
	 * Randomly picks a question
	 */
	@Override
	public void askQuestion() {
		// TODO Auto-generated method stub
		double random = Math.random();
		System.out.println(questions[(int)(random * 3)]);
	}

	/**
	 * Implements abstract method askQuestion()
	 * Randomly picks an answer
	 */
	@Override
	public void answerQuestion() {
		// TODO Auto-generated method stub
		double random = Math.random();
		System.out.println(answers[(int)(random * 3)]);
	}

}
