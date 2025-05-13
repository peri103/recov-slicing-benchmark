import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0}; // Initialize column data
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Print the values to verify correctness
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}