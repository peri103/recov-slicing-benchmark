import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix with values
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        /* write */ 
        BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        /* read */ 
        BlockRealMatrix readMatrix = matrix.getBlockRealMatrix(0, 0, 1, 1);

        // Print the read values
        System.out.println(readMatrix);
    }
}