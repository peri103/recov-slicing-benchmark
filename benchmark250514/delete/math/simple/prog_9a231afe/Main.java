import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        SymmetricMatrix matrix = new SymmetricMatrix(MatrixUtils.createRealMatrix(data));
        
        /* write */ matrix.setEntry(1, 1, 42.0);
        /* read */ double value = matrix.getEntry(1, 1);
        
        System.out.println(value);
    }
}