import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0}; // Example data
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Perform operations on another matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Multiply matrix by a scalar
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        
        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);
        
        // Create another vector and perform addition
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{2.0, 1.0, 0.0});
        RealVector sumVector = vector.add(anotherVector);
        
        // Print the sum vector
        System.out.println("Sum Vector: " + sumVector);
        
        // Read the sparse real vector using MatrixUtils (assuming a method exists)
        /* read */ RealVector readVector = vector; // Directly using the vector created
        
        // Print the vector to verify
        System.out.println("Read Vector: " + readVector);
    }
}