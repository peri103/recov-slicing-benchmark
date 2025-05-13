import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse matrix with some values
        double[][] data = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        /* write */
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data.length, data[0].length);

        // Fill the sparse matrix with data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sparseMatrix.setEntry(i, j, data[i][j]);
            }
        }

        /* read */
        RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix.getData());

        // Print the retrieved matrix to verify the values
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}