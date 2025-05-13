import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        // Create a symmetric matrix
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createRealMatrix(data);

        // Additional operations with vectors
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some unrelated arithmetic operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = symmetricMatrix;

        // Print the matrix to verify
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}