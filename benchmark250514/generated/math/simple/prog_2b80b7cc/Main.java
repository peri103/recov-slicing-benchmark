import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix with some values
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        /* read */ double value = matrix.getEntry(0, 0); // Reading the value at position (0,0)
        
        System.out.println(value); // Output should be 1.0
    }
}