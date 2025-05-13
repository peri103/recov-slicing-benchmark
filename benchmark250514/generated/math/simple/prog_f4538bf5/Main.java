import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        /* read */ RealMatrix readColumnMatrix = columnMatrix.getColumnMatrix(0);
        
        // Print the matrix to ensure the value is read correctly
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println(readColumnMatrix.getEntry(i, 0));
        }
    }
}