import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 array
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        // Use the write method to create a RealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector for additional complexity
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform some operations with the vector and matrix
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        RealVector resultVector = matrix.operate(vector);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Use the read method to get the same RealMatrix
        /* read */ RealMatrix readMatrix = matrix; // Assuming getRealMatrix is meant to return the matrix itself
        
        // Print the matrix to verify the read operation
        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Additional operations to make the program more complex
        RealMatrix matrixAddition = matrix.add(multipliedMatrix);
        System.out.println("Matrix Addition:");
        for (int i = 0; i < matrixAddition.getRowDimension(); i++) {
            for (int j = 0; j < matrixAddition.getColumnDimension(); j++) {
                System.out.print(matrixAddition.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}