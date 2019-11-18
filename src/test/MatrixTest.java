package test;
import model.Matrix;
public class MatrixTest {

	//Successfull
	public static void main(String[] args) {
		Matrix a = new Matrix(new double[][] {{1,2,3},{4,5,6}});
		Matrix b = new Matrix(new double[][] {{7,8},{9,10},{11,12}});
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.multiplyWith(b));
	}

}
