import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix with one row of data
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Extract the row real matrix from the created matrix
        /* read */ RealMatrix extractedMatrix = matrix.getRowMatrix(0);

        // Print the extracted matrix data
        for (int i = 0; i < extractedMatrix.getColumnDimension(); i++) {
            System.out.print(extractedMatrix.getEntry(0, i) + " ");
        }
    }
}