import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a simple 3x3 identity matrix for demonstration
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };

        // Create a triangular matrix using the data
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = triangularMatrix.operate(vector);
        
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More unrelated operations
        double determinant = triangularMatrix.getDeterminant();
        System.out.println("Determinant of the triangular matrix: " + determinant);

        // Retrieve the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operations to increase complexity
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = triangularMatrix.multiply(identityMatrix);

        System.out.println("Matrix after multiplication with identity matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}