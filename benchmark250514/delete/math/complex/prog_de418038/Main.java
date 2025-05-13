import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {0.0, 4.0, 5.0},
            {0.0, 0.0, 6.0}
        };

        // Create a triangular matrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Create a vector
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});

        // Perform some operations with the vector
        RealVector resultVector = triangularMatrix.operate(vector);

        // Print the result of vector operation
        System.out.println("Result of vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for additional operations
        double[][] data2 = {
            {7.0, 8.0, 9.0},
            {0.0, 10.0, 11.0},
            {0.0, 0.0, 12.0}
        };

        RealMatrix anotherMatrix = MatrixUtils.createTriangularMatrix(data2);

        // Perform matrix addition
        RealMatrix sumMatrix = triangularMatrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        System.out.println("Retrieved triangular matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}