import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array to be used with the write method
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create another 2D array for additional operations
        double[][] additionalData = {{5.0, 6.0}, {7.0, 8.0}};
        
        // Use the write method to create a RealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Create another matrix using the additional data
        RealMatrix additionalMatrix = MatrixUtils.createArray2DRowRealMatrix(additionalData);
        
        // Perform some operations on the matrices
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        
        // Create a vector for further operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0});
        
        // Multiply the sumMatrix with the vector
        RealVector resultVector = sumMatrix.operate(vector);
        
        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Use the read method to retrieve the array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to ensure it matches the original data
        System.out.println("Retrieved Data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the retrieved data
        double sum = 0;
        for (double[] row : retrievedData) {
            for (double value : row) {
                sum += value;
            }
        }
        System.out.println("Sum of Retrieved Data: " + sum);
    }
}