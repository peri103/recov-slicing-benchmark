import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a RealMatrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of vector operation
        System.out.println("Resultant vector:");
        for (double value : resultVector.toArray()) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Further operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        // Retrieve the array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify
        System.out.println("Retrieved matrix data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Print the added matrix
        System.out.println("Added matrix with identity:");
        for (double[] row : addedMatrix.getData()) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}