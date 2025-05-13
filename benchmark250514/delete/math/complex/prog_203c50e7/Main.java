import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Create a matrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a new row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Set the first row of the matrix to the new row vector
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform more operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealMatrix addedMatrix = matrix.add(scaledMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            System.out.println(addedMatrix.getRowVector(i));
        }

        // Retrieve the first row as a vector
        /* read */ RealVector retrievedVector = matrix.getRowVector(0);

        // Print the retrieved vector
        System.out.println("Retrieved vector: " + retrievedVector);

        // Create another matrix and perform operations
        double[][] anotherData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix sumMatrix = anotherMatrix.add(matrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            System.out.println(sumMatrix.getRowVector(i));
        }
    }
}