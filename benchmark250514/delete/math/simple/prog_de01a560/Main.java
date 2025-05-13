import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0}; // Initialize column data
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);
        
        // Print the retrieved matrix to verify the read operation
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}