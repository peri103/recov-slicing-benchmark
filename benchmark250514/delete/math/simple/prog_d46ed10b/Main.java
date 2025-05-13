import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(data);
        
        /* read */ RealMatrix readColumnMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);
        
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println(readColumnMatrix.getEntry(i, 0));
        }
    }
}