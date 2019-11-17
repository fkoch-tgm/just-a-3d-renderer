package model;

import java.util.Arrays;

/**
 * @author Felix
 * @version 2019-11-17
 */
public class Point {
	/**
	 * The x,y and z coordinates
	 */
	private int[] tuple;
	
	/**
	 * creates a new Point (0,0,0)
	 */
	public Point() {
		tuple = new int[3];
	}
	
	/**
	 * creates a new Point (x,y,z)
	 * @param x the x-value
	 * @param y the y-value
	 * @param z the z-value
	 */
	public Point(int x, int y, int z) {
		this();
		tuple[0]=x;
		tuple[1]=y;
		tuple[2]=z;
	}
	
	/**
	 * @return the x-value
	 */
	public int getX() {
		return tuple[0];
	}
	
	/**
	 * @return the y-value
	 */
	public int getY() {
		return tuple[1];
	}
	
	/**
	 * @return the z-value
	 */
	public int getZ() {
		return tuple[2];
	}
	
	/**
	 * Sets the x-value
	 * @param x the new x
	 */
	public void setX(int x) {
		tuple[0]=x;
	}
	
	/**
	 * Sets the y-value
	 * @param y the new y
	 */
	public void setY(int y) {
		tuple[1]=y;
	}
	
	/**
	 * Sets the z-value
	 * @param z the new z
	 */
	public void setZ(int z) {
		tuple[2]=z;
	}
	
	/**
	 * Adds an integer to the current x-value
	 * @param toX the value to add to x
	 */
	public void addToX(int toX) {
		setX(getX()+toX);
	}

	/**
	 * Adds an integer to the current y-value
	 * @param toY the value to add to y
	 */
	public void addToY(int toY) {
		setY(getY()+toY);
	}

	/**
	 * Adds an integer to the current z-value
	 * @param toZ the value to add to z
	 */
	public void addToZ(int toZ) {
		setZ(getZ()+toZ);
	}
	
	/**
	 * Adds a Vector to this Point
	 * @param vector a Vector
	 */
	public void addVectorToPoint(Vector vector) {
		addToX(vector.getX());
		addToY(vector.getY());
		addToZ(vector.getZ());
	}
	
	/**
	 * Subtracts a Vector from this Point
	 * @param vector a Vector
	 */
	public void subtractVectorFromPoint(Vector vector) {
		addToX(-vector.getX());
		addToY(-vector.getY());
		addToZ(-vector.getZ());
	}
	
	/**
	 * Subtracts a Point from the Point and returns the resulting Vector
	 * @param point another Point
	 * @return the result of this Point minus the Point point
	 */
	public Vector subtractPointFromPoint(Point point) {
		return new Vector(getX()-point.getX(), getY()-point.getY(), getZ()-point.getZ());
	}
	
	/**
	 * [TODO] this method should later call a Graphics API and draw the Point on Screen,
	 * at the moment, it just outputs the Coordinates
	 */
	public void drawPoint() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Point [tuple=" + Arrays.toString(tuple) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tuple);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (!Arrays.equals(tuple, other.tuple))
			return false;
		return true;
	}
	
	@Override
	public Point clone() {
		return new Point(getX(),getY(),getZ());
	}

}
