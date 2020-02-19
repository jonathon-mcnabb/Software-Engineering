/**
 * @author Mark Baldwin
 * Names: Jonathon McNabb & Carter Pasqualini
 */
import java.awt.Point;


public class StringPlay {
	
	public static void main(String[] args) {
		
		String stringOne = "C++ is cool";
		String stringTwo = "I love Java";
		
		String stringThree = "";
		stringThree = stringTwo.substring(7) + stringOne.substring(3);
		
		System.out.println(stringThree);
		
		Point point1 = new Point(1, 1);
		Point point2 = new Point(1, 1);
		
		System.out.println("Is point1 equal to point2?");
		System.out.println(point1 == point2);
		
		String compareOne = "HeLLo";
		String compareTwo = "hEllO";
		String compareThree = "HeLLo";
		
		System.out.println("compareOne = " + compareOne);
		System.out.println("compareTwo = " + compareTwo);
		System.out.println("compareThree = " + compareThree);
		
		System.out.println("Is compareOne equal to compareTwo? " + String.valueOf(compareOne.equals(compareTwo)));
		System.out.println("Is compareOne equal to compareTwo with ignorecase? " + String.valueOf(compareOne.equalsIgnoreCase(compareTwo)));
		System.out.println("Is compareOne equal to compareThree? " + String.valueOf(compareOne.equals(compareThree)));
	}
}
