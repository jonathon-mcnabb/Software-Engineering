/**
 * Detective class
 * Used as part of the PublicSafety exercise, CSCI306
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 */

public class Detective {
	private String name; //name of this detective
	private int badge; //badge number of this detective
	
	/**
	 * Constructor for detective: sets the detective name and badge number
	 */
	public Detective(String name, int badge) {
		super();
		this.name = name;
		this.badge = badge;
	}

	/**
	 * Overrides the print statement so that the detective's name and badge number are printed
	 */
	@Override
	public String toString() {
		return "Detective [Badge=" + badge + ", Name=" + name + "]";
	}
	
}
