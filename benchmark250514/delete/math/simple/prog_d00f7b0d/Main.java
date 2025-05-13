import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a row matrix with some values
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);

        // Retrieve the row matrix using MatrixUtils (assuming getRowRealMatrix is a utility method)
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(rowMatrix.getData());

        // Print the retrieved matrix to verify
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}