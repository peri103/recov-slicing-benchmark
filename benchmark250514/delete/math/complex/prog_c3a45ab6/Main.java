import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0, 0.0, 5.0};
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(data);

        // Perform some unrelated operations with matrices
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the original and transposed matrices
        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Some operations with vectors
        RealVector anotherVector = MatrixUtils.createRealVector(new double[] {2.0, 4.0, 6.0, 8.0, 10.0});
        RealVector sumVector = sparseVector.add(anotherVector);

        // Print the sum of vectors
        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the sparse real vector using MatrixUtils
        /* read */ RealVector readSparseVector = MatrixUtils.getSparseRealVector(sparseVector);

        // Print the read sparse vector to verify
        System.out.println("Read Sparse Vector:");
        for (int i = 0; i < readSparseVector.getDimension(); i++) {
            System.out.print(readSparseVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}