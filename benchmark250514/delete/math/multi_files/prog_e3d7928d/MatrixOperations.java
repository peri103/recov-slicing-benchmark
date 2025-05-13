import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    public static void performOperations(RealMatrix matrix) {
        // Initialize a vector
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform some operations with the matrix and vector
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More operations to increase complexity
        RealMatrix matrixSum = matrix.add(matrix);
        System.out.println("Matrix after addition with itself:");
        for (int i = 0; i < matrixSum.getRowDimension(); i++) {
            for (int j = 0; j < matrixSum.getColumnDimension(); j++) {
                System.out.print(matrixSum.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operation: matrix transpose
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
