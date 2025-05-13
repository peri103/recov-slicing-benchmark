import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        matrixOps.createSymmetricMatrix(data);

        // Perform vector operations
        VectorOperations vectorOps = new VectorOperations(new double[]{1, 2, 3});
        RealMatrix multipliedMatrix = matrixOps.multiplyWithTranspose();
        RealVector resultVector = vectorOps.operateWithMatrix(multipliedMatrix);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = matrixOps.getMatrix();

        // Print the original symmetric matrix to verify
        System.out.println("Original Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}