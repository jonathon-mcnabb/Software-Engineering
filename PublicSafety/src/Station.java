/**
 * Station class
 * Used as part of the PublicSafety exercise, CSCI306
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 */

import java.util.Scanner; 

public class Station {
	private String stationName; // name of the station
	private final static int MAX_DETECTIVES = 5; // max # of detectives at a station
	private Detective[] detectiveList = new Detective[MAX_DETECTIVES]; // initializes detective list
	private int numDetectives = 0; // initializes # of detectives at station
	
	/**
	 * Constructor for station: sets the station name
	 */
	public Station(String stationName) {
		super();
		this.stationName = stationName;
	}
	
	/**
	 * prints all detectives hired at "this" station
	 */
	public void printDetectivesInStation() {

		System.out.println("List of detectives for " + stationName);
		
		for(int i = 0; i < numDetectives; i++) {
			System.out.println(detectiveList[i]);
		}
	}
	
	/**
	 * Verifies that another detective can be hired at the station
	 * If an officer can be hired, prompts user and adds detective to station
	 */
	public void hire() {
		Scanner chompyChomp = new Scanner(System.in); 
		if(numDetectives < MAX_DETECTIVES) {
			System.out.print("New hire for " + stationName + "...Enter detective's name: ");
			String name = chompyChomp.nextLine();
			detectiveList[numDetectives] = new Detective(name, PublicSafety.giveNextBadgeNumber());
			numDetectives++;
		} else {
			System.out.println("Can't hire any more detectives for " + stationName);
		}
		
	}
	
}
