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
	 * Adds a Vector to this Vector
	 * @param other the other Vector
	 */
	public void addVectorToVector(Vector other) {
			addToX(other.getX());
			addToY(other.getY());
			addToZ(other.getZ());
	}
	
	/**
	 * Subtracts the other Vector from this Vector
	 * @param other the other Vector
	 */
	public void subtractVectorFromVector(Vector other) {
		addToX(-other.getX());
		addToY(-other.getY());
		addToZ(-other.getZ());
	}
	
	public void rotateXY(double degree) {
		double rad = Math.toRadians(degree);
		//TODO 
	}
	
	@Override
	public Vector clone() {
		return new Vector(getX(),getY(),getZ());
	}
}
