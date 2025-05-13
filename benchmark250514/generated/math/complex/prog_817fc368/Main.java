import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zeros
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Write a value to the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Initialize a vector of size 3
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Add some unrelated operations
        double sum = 0.0;
        for (int i = 0; i < 100; i++) {
            sum += Math.sqrt(i);
        }
        System.out.println("Sum of square roots from 0 to 99: " + sum);
        
        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value
        System.out.println("Value at position (1, 1) in the matrix: " + value);
        
        // Perform another matrix operation
        matrix.setEntry(0, 0, 3.3);
        matrix.setEntry(2, 2, 7.7);
        
        // Calculate the trace of the matrix (sum of diagonal elements)
        double trace = matrix.getEntry(0, 0) + matrix.getEntry(1, 1) + matrix.getEntry(2, 2);
        System.out.println("Trace of the matrix: " + trace);
    }
}