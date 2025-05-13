import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the matrix
        double[] data = {1.0, 2.0, 3.0};
        
        // Use the write method to create a column real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Use the read method to retrieve the column real matrix
        /* read */ RealMatrix retrievedMatrix = matrix.getColumnMatrix(0);
        
        // Print the retrieved matrix to verify the read operation
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}