import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Initialize a vector for additional operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for additional operations
        double[][] data2 = {
            {4, 5, 6},
            {5, 7, 8},
            {6, 8, 10}
        };
        RealMatrix anotherMatrix = MatrixUtils.createSymmetricMatrix(data2);

        // Add the two matrices
        RealMatrix sumMatrix = symmetricMatrix.add(anotherMatrix);

        // Print the sum of matrices
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the symmetric matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify the operations
        System.out.println("Retrieved symmetric matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}