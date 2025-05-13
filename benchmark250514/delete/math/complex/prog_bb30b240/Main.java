import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Perform additional operations to make the program more complex
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        });

        // Multiply the vector with the matrix
        RealVector resultVector = matrix.operate(vector);

        // Print the result of vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix returns the created matrix

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}