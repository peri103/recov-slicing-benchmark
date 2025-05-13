import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);

        // Create a new vector for operations
        RealVector anotherVector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector addedVector = columnVector.add(anotherVector);

        // Perform some operations on vectors
        double dotProduct = columnVector.dotProduct(anotherVector);
        System.out.println("Dot Product: " + dotProduct);

        // Matrix multiplication
        RealMatrix multipliedMatrix = resultMatrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Read the column real vector
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);

        // Perform operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of Read Vector: " + norm);

        // Create another matrix for more complexity
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{10.0, 11.0}, {12.0, 13.0}, {14.0, 15.0}});
        RealMatrix combinedMatrix = anotherMatrix.add(multipliedMatrix);
        System.out.println("Combined Matrix: " + combinedMatrix);
    }
}