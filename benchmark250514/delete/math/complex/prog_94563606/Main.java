import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Perform some unrelated operations with matrices and vectors
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}});
        RealVector anotherVector = anotherMatrix.getColumnVector(1);
        System.out.println("Another vector: " + anotherVector);

        // Add vectors
        RealVector sumVector = columnVector.add(anotherVector);
        System.out.println("Sum of vectors: " + sumVector);

        // Multiply matrix with a scalar
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled matrix: " + scaledMatrix);

        // Read the column vector
        /* read */ RealVector readVector = MatrixUtils.getColumnRealVector(matrix, 0);
        System.out.println("Read vector: " + readVector);

        // Perform some operations on the read vector
        RealVector scaledReadVector = readVector.mapMultiply(3.0);
        System.out.println("Scaled read vector: " + scaledReadVector);

        // Add the read vector to another vector
        RealVector combinedVector = scaledReadVector.add(anotherVector);
        System.out.println("Combined vector: " + combinedVector);
    }
}