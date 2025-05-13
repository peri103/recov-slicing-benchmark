import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the row data
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a row matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform some operations on the matrix
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        double determinant = multipliedMatrix.getDeterminant();
        System.out.println("Determinant of multiplied matrix: " + determinant);

        // Create another matrix and perform operations
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data);
        RealMatrix sumMatrix = matrix2.add(multipliedMatrix);
        System.out.println("Sum matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row matrix using the read method
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);

        // Print the read matrix
        System.out.println("Read matrix row: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        // Additional operations on matrices
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}