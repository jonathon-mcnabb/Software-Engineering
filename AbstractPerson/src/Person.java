/**
 * Person class. 
 *  
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 * 
 * Purpose. Implement abstract class person to practice abstract classes
 */

public abstract class Person {
	private String myName; //persons name
	private String occupation; //persons job or occupation
	
	/**
	 * Constructor to set up a persons name and occupation
	 * Also calls super class (object)
	 * @param myName : passes person name into the constructor
	 * @param occupation : passes person occupation into the constructor 
	 */
	public Person(String myName, String occupation) {
		// call person super class (Object)
		super();
		// assign values to instance variables
		this.myName = myName;
		this.occupation = occupation;
	}
	
	/**
	 * Outputs "What is your name?" to the terminal
	 */
	public void askName() {
		System.out.println("What is your name?");
	}
	
	/**
	 * Outputs "My name is _PERSONS_NAME_" to the terminal
	 */
	public void giveName() {
		System.out.println("My name is " + myName);
	}
	
	/**
	 * Outputs "I am a _OCCUPATION_" to the terminal
	 */
	public void whatDoYouDo() {
		System.out.println("I am a " + occupation);
	}
	
	/**
	 * Abstract method askQuestion to be implemented by child class
	 */
	public abstract void askQuestion();
	
	/**
	 * Abstract method answerQuestion to be implemented by child class
	 */
	public abstract void answerQuestion();
	

}
