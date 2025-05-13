import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        /* read */ RealMatrix rowMatrix = matrix.getRowMatrix(0);
        
        for (int i = 0; i < rowMatrix.getColumnDimension(); i++) {
            System.out.print(rowMatrix.getEntry(0, i) + " ");
        }
    }
}