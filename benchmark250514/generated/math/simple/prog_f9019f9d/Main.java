import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        /* read */ RealMatrix readMatrix = columnMatrix.getColumnMatrix(0);
        
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
    }
}