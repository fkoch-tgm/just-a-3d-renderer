package tests;

import model.Point;
import model.Vector;

public class Test_Point_and_Vector {
	public static void main(String[] args) {
		Point p1 = new Point(1,2,1);
		Point p2 = new Point(0,4,4);
		Vector v1 = new Vector(2,0,0);
		Vector v2;
		
		p1.drawPoint();
		p2.drawPoint();
		
		v2 = p1.subtractPointFromPoint(p2);
		
		v1 = v1.addVectorToVector(v2);
		
		p1.addVectorToPoint(v1);
		p1.drawPoint();
		
		p2.subtractVectorFromPoint(v2);
		p2.drawPoint();
	}
}
