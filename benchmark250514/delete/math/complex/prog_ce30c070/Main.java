import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform some unrelated operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}});
        RealVector anotherVector = new ArrayRealVector(new double[]{11.0, 12.0});

        // Perform matrix-vector multiplication
        RealVector result = anotherMatrix.operate(anotherVector);
        System.out.println("Result of matrix-vector multiplication: " + result);

        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix: " + transposedMatrix);

        // Get the column real vector using the read method
        /* read */ RealVector resultVector = matrix.getColumnVector(0);

        // Print the result to verify
        System.out.println("Column vector from matrix: " + resultVector);

        // More unrelated operations
        RealVector sumVector = columnVector.add(anotherVector);
        System.out.println("Sum of vectors: " + sumVector);
    }
}