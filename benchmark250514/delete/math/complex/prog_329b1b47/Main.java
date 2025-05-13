import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row
        RealMatrix matrix = MatrixUtils.createRealMatrix(1, 3);

        // Create a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Set the row vector to the matrix
        matrix.setRowVector(0, rowVector);

        // Additional computation with another matrix
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Perform matrix multiplication
        RealMatrix resultMatrix = anotherMatrix.multiply(matrix.transpose());

        // Print the result of the matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the values of the read row vector
        System.out.println("Read row vector:");
        for (int i = 0; i < readRowVector.getDimension(); i++) {
            System.out.print(readRowVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional operations with RealVector
        RealVector scaledVector = readRowVector.mapMultiply(2.0);
        System.out.println("Scaled row vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
    }
}