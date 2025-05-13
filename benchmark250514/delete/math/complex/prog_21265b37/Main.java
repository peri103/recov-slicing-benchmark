import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to use for creating a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create another matrix to demonstrate more complex operations
        double[][] additionalData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        
        // Perform a matrix addition operation
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        
        // Use createRowRealVector to write a row vector into the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[] {7.0, 8.0, 9.0});
        /* write */ matrix.setRowVector(1, rowVector);
        
        // Perform a matrix multiplication operation
        RealMatrix productMatrix = matrix.multiply(additionalMatrix);
        
        // Print the resulting product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Use getRowRealVector to read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);
        
        // Print the read vector
        System.out.println("Read Vector:");
        System.out.println(readVector);
        
        // Additional operations: scaling a vector and matrix
        RealVector scaledVector = readVector.mapMultiply(2.0);
        RealMatrix scaledMatrix = matrix.scalarMultiply(0.5);
        
        // Print the scaled vector and matrix
        System.out.println("Scaled Vector:");
        System.out.println(scaledVector);
        
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}