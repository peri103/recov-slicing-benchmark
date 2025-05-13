import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Perform operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);

        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional matrix operations
        RealMatrix transposeMatrix = matrix.transpose();
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Access the matrix to ensure the read method reads the value written by the write method
        /* read */ RealMatrix readMatrix = matrix;

        // Output the matrix to verify correctness
        System.out.println("Original matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional unrelated code: Create and manipulate another vector
        RealVector anotherVector = new ArrayRealVector(new double[] {7.0, 8.0});
        RealVector additionResult = vector.add(anotherVector);
        System.out.println("Result of vector addition:");
        for (int i = 0; i < additionResult.getDimension(); i++) {
            System.out.print(additionResult.getEntry(i) + " ");
        }
        System.out.println();
    }
}