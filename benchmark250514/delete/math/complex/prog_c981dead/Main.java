import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a row real matrix
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Create a row real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Create a new vector and perform operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector addedVector = vector.mapAdd(10.0);
        
        // Some unrelated complex operations
        double sum = 0;
        for (int i = 0; i < addedVector.getDimension(); i++) {
            sum += addedVector.getEntry(i);
        }
        System.out.println("Sum of elements in the added vector: " + sum);
        
        // Retrieve the row real matrix using the getRowMatrix method
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Further operations on the matrix
        RealMatrix scaledMatrix = retrievedMatrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}