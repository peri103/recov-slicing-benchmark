import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a triangular matrix using MatrixUtils
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data, true);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(triangularMatrix.getRowDimension());
        RealMatrix addedMatrix = triangularMatrix.add(identityMatrix);

        // Create and manipulate vectors
        RealVector vector1 = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector vector2 = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector vectorSum = vector1.add(vector2);

        // More matrix operations
        RealMatrix multipliedMatrix = addedMatrix.multiply(triangularMatrix);
        RealMatrix subMatrix = multipliedMatrix.getSubMatrix(0, 1, 0, 1);

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix, true);

        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the sub matrix
        System.out.println("Sub Matrix:");
        for (int i = 0; i < subMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subMatrix.getColumnDimension(); j++) {
                System.out.print(subMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print vector sum
        System.out.println("Vector Sum:");
        for (int i = 0; i < vectorSum.getDimension(); i++) {
            System.out.print(vectorSum.getEntry(i) + " ");
        }
        System.out.println();
    }
}