import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize diagonal values
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = addedMatrix.operate(vector);
        
        // Output the result of vector operations
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // More complex operations
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        double matrixNorm = multipliedMatrix.getNorm();
        System.out.println("Matrix Norm: " + matrixNorm);

        // Read the diagonal values from the matrix
        /* read */ double[] readDiagonalValues = matrix.getColumn(0);
        
        // Output the diagonal values
        System.out.println("Diagonal Values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }

        // Additional matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        double trace = transposedMatrix.getTrace();
        System.out.println("Trace of Transposed Matrix: " + trace);
    }
}