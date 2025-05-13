import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the row data
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a row matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Read the row matrix using the read method
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);

        // Print the read matrix
        System.out.println("Read matrix row: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}