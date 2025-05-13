import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix matrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Set a value in the matrix
        matrix.setEntry(0, 0, 5.0);
        
        // Perform some unrelated operations
        RealVector vector = new ArrayRealVector(3);
        vector.setEntry(0, 2.0);
        vector.setEntry(1, 3.0);
        vector.setEntry(2, 4.0);
        
        // Multiply the matrix by the vector
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform additional operations on the matrix
        matrix.setEntry(1, 1, 10.0);
        matrix.setEntry(2, 2, 15.0);
        
        // Retrieve the sparse matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(matrix);
        
        // Read the value that was written
        double value = retrievedMatrix.getEntry(0, 0);
        
        // Print the value to ensure correctness
        System.out.println("Retrieved value: " + value);
        
        // Perform another unrelated operation
        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 0.0, -1.0});
        
        // Add vectors
        RealVector sumVector = vector.add(anotherVector);
        
        // Print the result of the addition
        System.out.println("Result of vector addition:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }
    }
}