package model;

/**
 * A 3D-Vector
 * @author Felix
 * @version 2019-11-17
 */
public class Vector {
	/**
	 * The x,y and z values
	 */
	private int[] tuple;
	
	/**
	 * creates a new Vector (0,0,0)
	 */
	public Vector() {
		tuple = new int[3];
	}
	
	/**
	 * creates a new Vector (x,y,z)
	 * @param x the x-value
	 * @param y the y-value
	 * @param z the z-value
	 */
	public Vector(int x, int y, int z) {
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
	 * Adds a Vector to the Vector and returns the result
	 * @param other the other Vector
	 * @return the resulting Vector
	 */
	public Vector addVectorToVector(Vector other) {
		return null; // TODO
	}
	
	/**
	 * Subtracts the other Vector from the Vector and returns the result
	 * @param other the other Vector
	 * @return the result of this Vector - the other Vector
	 */
	public Vector subtractVectorFromVector(Vector other) {
		return null; //TODO
	}
}
