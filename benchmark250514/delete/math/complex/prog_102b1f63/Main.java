import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the write method
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform operations on a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print matrix details
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        printMatrix(multipliedMatrix);

        // Some unrelated calculations
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] * i;
        }
        System.out.println("Sum of data elements multiplied by index: " + sum);

        // Read the sparse real vector using the read method
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());

        // Print the vector to verify the read value
        System.out.println("Read Vector: " + readVector);
    }

    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}