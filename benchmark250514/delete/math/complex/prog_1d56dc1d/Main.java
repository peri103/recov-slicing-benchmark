import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform some unrelated operations to make the program complex
        RealVector vector1 = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector vector2 = new ArrayRealVector(new double[] {4, 5, 6});
        
        // Add two vectors
        RealVector resultVector = vector1.add(vector2);
        System.out.println("Result of vector addition: " + resultVector);

        // Multiply the matrix with a vector
        RealVector matrixVectorProduct = matrix.operate(vector1);
        System.out.println("Matrix-vector product: " + matrixVectorProduct);

        // Perform more operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);

        // Print the symmetric matrix
        System.out.println("Symmetric matrix: ");
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}