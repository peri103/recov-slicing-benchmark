import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a column vector
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a column real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Get the column real matrix from the created matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the column matrix to verify
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}