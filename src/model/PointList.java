package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PointList {
	private static final boolean RAINBOW = false;
	Point[] points;
	
	/**
	 * Creates a new (empty) PointList with space for 100 Points
	 */
	public PointList() {
		points= new Point[100];
	}
	
	/**
	 * Fills the List with random Points in the specified range
	 * @param maxWidth the maximal horizontal distance from the origin
	 * @param maxHeight the maximal vertical distance from the origin
	 */
	public void fillList(int maxWidth, int maxHeight) {
		Random rand = new Random();
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(5+rand.nextInt(maxWidth-10), 5+rand.nextInt(maxHeight-10), 0);
		}
	}
	
	/**
	 * Draws all the Points to a graphics-object
	 * @param g the Graphics-Object
	 */
	public void draw(Graphics g) {
		Random rand = new Random();
		for (Point point : points) {
			if(RAINBOW) g.setColor(new Color(rand.nextInt((int) Math.pow(2, 24))));
			else g.setColor(Color.black);
			g.fillOval(point.getX(), point.getY(), 5, 5);
		}
	}
}
