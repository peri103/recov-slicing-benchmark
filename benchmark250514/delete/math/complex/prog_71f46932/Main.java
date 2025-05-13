import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize some data
        double[] rowData = {1.0, 2.0, 3.0};
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a matrix using another method
        RealMatrix matrix2 = new Array2DRowRealMatrix(matrixData);

        // Perform some operations on matrix2
        RealMatrix transposedMatrix = matrix2.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Add a row to matrix2
        RealMatrix extendedMatrix = matrix2.appendRow(rowData);

        // Perform some operations on extendedMatrix
        System.out.println("Extended matrix:");
        for (int i = 0; i < extendedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < extendedMatrix.getColumnDimension(); j++) {
                System.out.print(extendedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original write operation
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Some unrelated calculations
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);

        // Perform an operation on the original matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original read operation
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        // Display retrieved matrix
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}