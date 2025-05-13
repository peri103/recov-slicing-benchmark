import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Get the same row real matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);

        // Print the retrieved matrix to verify the correct operation
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}