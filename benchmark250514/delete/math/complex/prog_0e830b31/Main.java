import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and data for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {0.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 0.0}
        };

        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data, rows, columns);

        // Create another sparse matrix using OpenMapRealMatrix for complexity
        OpenMapRealMatrix complexMatrix = new OpenMapRealMatrix(rows, columns);
        complexMatrix.setEntry(0, 1, 5.0);
        complexMatrix.setEntry(1, 2, 3.0);

        // Perform some operations on complexMatrix
        RealMatrix multipliedMatrix = complexMatrix.scalarMultiply(2.0);

        // Iterate over multipliedMatrix and print values
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the sparse matrix using MatrixUtils (assuming getSparseMatrix is a valid method)
        // In reality, MatrixUtils does not have a getSparseMatrix method, but for the sake of this task, we assume it exists
        /* read */ RealMatrix readMatrix = sparseMatrix; // Placeholder for getSparseMatrix method

        // Perform some operations on readMatrix
        RealMatrix transposedMatrix = readMatrix.transpose();

        // Print the transposed matrix to verify the operation
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}