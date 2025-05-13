import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a column matrix with some values
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Retrieve the column matrix
        /* read */ RealMatrix retrievedColumnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Print the retrieved column matrix
        for (int i = 0; i < retrievedColumnMatrix.getRowDimension(); i++) {
            System.out.println(retrievedColumnMatrix.getEntry(i, 0));
        }
    }
}