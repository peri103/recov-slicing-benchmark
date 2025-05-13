import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions
        int rows = 3;
        int columns = 3;

        // Create a triangular matrix with specified dimensions
        RealMatrix triangularMatrix = MatrixUtils.createRealMatrix(rows, columns);
        
        // Fill the matrix with some values to make it triangular
        triangularMatrix.setEntry(0, 0, 1.0);
        triangularMatrix.setEntry(1, 0, 0.0);
        triangularMatrix.setEntry(1, 1, 2.0);
        triangularMatrix.setEntry(2, 0, 0.0);
        triangularMatrix.setEntry(2, 1, 0.0);
        triangularMatrix.setEntry(2, 2, 3.0);

        // Create a RealVector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector transformedVector = triangularMatrix.operate(vector);
        System.out.println("Transformed vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.print(transformedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(rows);
        RealMatrix multipliedMatrix = triangularMatrix.multiply(identityMatrix);

        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ MatrixUtils.createTriangularMatrix(triangularMatrix);

        // Perform some arithmetic operations
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += triangularMatrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of triangular matrix elements: " + sum);

        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify it was correctly read
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional calculations
        double determinant = triangularMatrix.getDeterminant();
        System.out.println("Determinant of triangular matrix: " + determinant);
    }
}