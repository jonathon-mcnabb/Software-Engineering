import java.awt.Point;
import java.util.ArrayList;


public class QuestionsClass {

	public static void main(String[] args) {
		ArrayList things = new ArrayList();
		things.add("Cyndi");
		things.add(new Point(5,6));
		for(Object o : things)
			// java knows how many items are in things and will do all without us thinking about it
			System.out.println(o);
		for(int i=0;i<2;i++) {
			System.out.println(things.get(i));
		}
		


		ArrayList<Point> points;
		
		// calling contructor for an array list of points
		points = new ArrayList<Point>();
		points.add(new Point(3,4));
		Point p = points.get(0);
		
		
		
		// why isn't int an object
		int x = 5;
		// vs
		Integer y = new Integer(5);
		
		// as far as what is stored in memory, how are these two different? 
		// Are they accessed differently?
		// Are the bits different?
		
		System.out.println(x);
		System.out.println(y);
	}

}
