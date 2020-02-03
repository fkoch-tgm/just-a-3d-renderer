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
	 * @return the matrix-representation of this Vector
	 */
	public Matrix getMatrix() {
		return new Matrix(new double[][] {{getX()},{getY()},{getZ()}});
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
	 * Uses a 3x1-Matrix to set the Values of the Vector
	 * @param m the Matrix
	 */
	public void setMatrix(Matrix m) {
		if(m.getRows() != 3 || m.getColumns() != 1) throw new IllegalArgumentException("Matrix must be of the form 3x1");
		double[][] arr = m.getArrayForm();
		setX((int)arr[0][0]);
		setY((int)arr[1][0]);
		setZ((int)arr[2][0]);
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
	
	/**
	 * Rotates the Vector by the given angle in the XY-plane
	 * @param degree the angle in degrees
	 */
	public void rotateXY(double degree) {
		double rad = Math.toRadians(degree);
		Matrix rotMartix = new Matrix(new double[][] {{Math.cos(rad), -1* Math.sin(rad), 0},{Math.sin(rad), Math.cos(rad), 0},{0,0,1}});
		this.setMatrix(rotMartix.multiplyWith(this.getMatrix()));
	}
	
	/**
	 * Rotates the Vector by the given angle in the XZ-plane
	 * @param degree the angle in degrees
	 */
	public void rotateXZ(double degree) {
		double rad = Math.toRadians(degree);
		Matrix rotMartix = new Matrix(new double[][] {{Math.cos(rad), 0, -1* Math.sin(rad)},{0,1,0},{-1* Math.sin(rad),0,Math.cos(rad)}});
		this.setMatrix(rotMartix.multiplyWith(this.getMatrix()));
	}
	
	/**
	 * Rotates the Vector by the given angle in the YZ-plane
	 * @param degree the angle in degrees
	 */
	public void rotateYZ(double degree) {
		double rad = Math.toRadians(degree);
		Matrix rotMartix = new Matrix(new double[][] {{1,0,0},{0,Math.cos(rad),-1*Math.sin(rad)},{0,Math.sin(rad),Math.cos(rad)}});
		this.setMatrix(rotMartix.multiplyWith(this.getMatrix()));
	}
	
	/**
	 * Scales the Vector based on specific values
	 * @param scaleX scaling along the x-axis 
	 * @param scaleY scaling along the y-axis
	 * @param scaleZ scaling along the z-axis
	 */
	public void scale(double scaleX,double scaleY, double scaleZ) {
		Matrix scaleMatrix = new Matrix(new double[][] {{scaleX,0,0},{0,scaleY,0},{0,0,scaleZ}});
		this.setMatrix(scaleMatrix.multiplyWith(this.getMatrix()));
	}
	
	@Override
	public Vector clone() {
		return new Vector(getX(),getY(),getZ());
	}
	
	@Override
	public String toString() {
		return "Vector("+getX()+","+getY()+","+getZ()+")";
	}
}
