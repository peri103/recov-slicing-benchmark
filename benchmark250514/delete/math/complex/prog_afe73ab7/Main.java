import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row vector to be added to the matrix
        double[] rowVectorData = {7.0, 8.0, 9.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowVectorData);

        // Perform some unrelated matrix operations
        double[][] additionalMatrixData = {
            {2.0, 1.0, 0.0},
            {0.0, 1.0, 2.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Set the row vector into the matrix at a specific row index
        matrix.setRowVector(1, rowVector);

        // Perform some more unrelated operations
        double[] columnVectorData = {1.0, 1.0};
        RealVector columnVector = MatrixUtils.createColumnRealVector(columnVectorData);
        RealMatrix columnMatrix = columnVector.outerProduct(columnVector);
        System.out.println("Outer product of column vector:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            for (int j = 0; j < columnMatrix.getColumnDimension(); j++) {
                System.out.print(columnMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);
    }
}