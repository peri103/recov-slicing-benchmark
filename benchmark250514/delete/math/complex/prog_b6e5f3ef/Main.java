import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial values
        double[] initialValues = {1.0, 0.0, 3.0, 0.0, 5.0};
        
        // Write operation
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(initialValues);

        // Create a dense matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Output the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform operations on the sparse vector
        RealVector scaledVector = sparseVector.mapMultiply(2.0);
        double norm = sparseVector.getNorm();

        // Output the scaled vector and its norm
        System.out.println("Scaled Sparse Vector: " + scaledVector);
        System.out.println("Norm of Sparse Vector: " + norm);

        // Read operation
        /* read */ RealVector readVector = sparseVector;

        // Output the vector to verify the read value
        System.out.println("Sparse Vector: " + readVector);

        // Output the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}