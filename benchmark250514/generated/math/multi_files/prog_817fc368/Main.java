import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a MatrixOperations object
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        
        // Set a value in the matrix
        matrixOps.setMatrixEntry(1, 1, 5.5);

        // Initialize a vector of size 3
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrixOps.getMatrix().operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Use MatrixReader to read the value
        MatrixReader matrixReader = new MatrixReader(matrixOps.getMatrix());
        double value = matrixReader.readMatrixEntry(1, 1);
        
        // Print the value
        System.out.println("Value at position (1, 1) in the matrix: " + value);
        
        // Perform another matrix operation
        matrixOps.setMatrixEntry(0, 0, 3.3);
        matrixOps.setMatrixEntry(2, 2, 7.7);
        
        // Calculate the trace of the matrix (sum of diagonal elements)
        double trace = matrixOps.getMatrix().getEntry(0, 0) + matrixOps.getMatrix().getEntry(1, 1) + matrixOps.getMatrix().getEntry(2, 2);
        System.out.println("Trace of the matrix: " + trace);
    }
}