/**
 * PublicSafety class
 * Used as part of the PublicSafety exercise, CSCI306
 * 
 * @author Jonathon McNabb
 * @author Carter Pasqualini
 */

public class PublicSafety {
	private Station[] stationList = new Station[2];//list of stations attached to the public safety
	
	private static int nextBadgeNumber = 1;//badge number to be assigned to the next detective

	/**
	 * Constructor for public safety: sets the university station location and city station location
	 */
	public PublicSafety(String universityStation, String cityStation) {
		super();
		stationList[1] = new Station(universityStation);
		stationList[0] = new Station(cityStation);
	}
	
	/**
	 * decides which station should hire the next detective and calls methods to prompt the user for the detective
	 */
	public void doHire(boolean cityHire) {
		if(cityHire) {
			// hire in cityStation
			stationList[0].hire();
		} else {
			// hire in university station
			stationList[1].hire();
		}
	}

	/**
	 * Returns and increments the badge number
	 */
	public static int giveNextBadgeNumber() {
		return nextBadgeNumber++;
	}
	
	/**
	 * Iterates through every station and prints each detective at each station
	 */
	public void printAllDetectiveLists() {
		for (Station station : stationList) {
			station.printDetectivesInStation();
			System.out.println();
		}
	}
	
}
