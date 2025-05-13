import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        /* read */ double[][] block = matrix.getData();
        
        for (double[] row : block) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}