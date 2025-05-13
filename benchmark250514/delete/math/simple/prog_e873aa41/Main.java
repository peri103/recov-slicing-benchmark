import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a row matrix with a single row of data
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */
        RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        /* read */
        RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the retrieved matrix to verify its contents
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}