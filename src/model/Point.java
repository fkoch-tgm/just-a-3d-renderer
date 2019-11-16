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
	public void sety(int y) {
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
	 * Adds a Vector to a Point and returns the resulting Point
	 * @param vector a Vector
	 * @return the result of Vector + Point
	 */
	public Point addVectorToPoint(Vector vector) {
		return null; //TODO 
	}
	
	/**
	 * Subtracts a Vector from a Point and returns the resulting Point
	 * @param vector a Vector
	 * @return the result of Point - Vector
	 */
	public Point subtractVectorFromPoint(Vector vector) {
		return null; //TODO
	}
	
	/**
	 * Subtracts a Point from the Point and returns the resulting Vector
	 * @param point another Point
	 * @return the result of this Point minus the Point point
	 */
	public Vector subtractPointFromPoint(Point point) {
		return null; //TODO
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
	

}
