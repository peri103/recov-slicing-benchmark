import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiagonalMatrix with size 3
        DiagonalMatrix matrix = new DiagonalMatrix(3);
        
        // Use the setEntry method to write a value to the matrix
        /* write */ matrix.setEntry(0, 5.0);
        
        // Create a RealVector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Initialize another matrix and perform matrix addition
        DiagonalMatrix anotherMatrix = new DiagonalMatrix(new double[]{2.0, 3.0, 4.0});
        DiagonalMatrix sumMatrix = new DiagonalMatrix(3);
        
        for (int i = 0; i < 3; i++) {
            sumMatrix.setEntry(i, matrix.getEntry(i) + anotherMatrix.getEntry(i));
        }
        
        // Perform operations on the resultVector
        RealVector scaledVector = resultVector.mapMultiply(2.0);
        
        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0);
        
        // Print the value to ensure it was correctly read
        System.out.println("Read value: " + value);
        
        // Print the scaled vector for additional complexity
        System.out.println("Scaled vector: " + scaledVector);
        
        // Calculate and print the norm of the sumMatrix
        double norm = MatrixUtils.createRealMatrix(new double[][]{
            {sumMatrix.getEntry(0), 0, 0},
            {0, sumMatrix.getEntry(1), 0},
            {0, 0, sumMatrix.getEntry(2)}
        }).getNorm();
        
        System.out.println("Norm of sum matrix: " + norm);
    }
}