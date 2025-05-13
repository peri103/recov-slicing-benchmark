import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a matrix using the data array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{5.0, 6.0});

        // Perform some unrelated operations with other matrices
        double[][] anotherData = {
            {7.0, 8.0},
            {9.0, 10.0}
        };

        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealVector anotherColumnVector = new ArrayRealVector(new double[]{11.0, 12.0});
        anotherMatrix.setColumnVector(1, anotherColumnVector);
        
        // Perform some matrix operations
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Set the column vector to the matrix at column index 0
        /* write */ matrix.setColumnVector(0, columnVector);

        // Perform more unrelated operations
        RealVector vectorToAdd = new ArrayRealVector(new double[]{1.0, 1.0});
        RealVector addedVector = anotherColumnVector.add(vectorToAdd);
        System.out.println("Added Vector: " + addedVector);

        // Retrieve the column vector from the matrix at column index 0
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println("Retrieved Vector: " + retrievedVector);
    }
}