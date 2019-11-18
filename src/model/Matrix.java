package model;

public class Matrix {
	private double[][] matrix;
	
	/**
	 * Creates a new Matrix from a double double Array
	 */
	public Matrix(double[][] matrixArray) {
		setMatrix(matrixArray);
	}
	
	private void setMatrix(double[][] m) {
		if(m.length == 0) throw new IllegalArgumentException("Matrix size must be positive"); 
		int l = m[0].length;
		if(l == 0) throw new IllegalArgumentException("Matrix size must be positive");
		for(int i = 1; i < m.length; i++) {
			if(m[i].length != l) throw new IllegalArgumentException("Matrix width must be equal");
		}

		matrix = new double[m.length][l];
		for(int i=0; i<matrix.length; i++) {
			for(int j =0; j<matrix[0].length; j++) {
				matrix[i][j] = m[i][j];
			}
		}
	}
	
	private int getRows() {
		return matrix.length;
	}
	
	private int getColumns() {
		return matrix[0].length;
	}
	
	/**
	 * Multiplys two Matrices
	 * @param secondMatrix the right matrix
	 * @return the result
	 */
	public Matrix multiplyWith(Matrix secondMatrix) {
		//The number of columns of the 1st matrix must equal 
		//	the number of rows of the 2nd matrix.
		if(this.getColumns() != secondMatrix.getRows()) throw new IllegalArgumentException("The number of columns of the 1st matrix must equal the number of rows of the 2nd matrix.");
		
		//output matrix:
		// the result will have the same number of rows as the 1st matrix, 
		//	and the same number of columns as the 2nd matrix
		double[][] out = new double[this.getRows()][secondMatrix.getColumns()];
		
		double d = 0;
		
		for(int i = 0; i < out.length; i++) {			//out row
			for(int j = 0; j < out[0].length; j++) {	//out column
				for(int c=0; c < this.getColumns(); c++) {
					d += this.matrix[i][c] * secondMatrix.matrix[c][j];
				}
				out[i][j] = d;
				d = 0;
			}
		}
		
		return new Matrix(out);
	}
	
	@Override
	public String toString() {
		String s ="";
		for(int i=0; i < matrix.length; i++) {
			s += "||";
			for(int j=0; j < matrix[0].length;j++) {
				s += "" + matrix[i][j] + "|";
			}
			s += "|\n";
		}
		return s;
	}
}