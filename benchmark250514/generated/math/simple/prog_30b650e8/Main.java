import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1}, {2}, {3}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(new double[]{1, 2, 3});
        
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}