import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix with initial values
        double[][] initialData = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);
        
        // Since MatrixUtils does not have a getRealMatrix method,
        // we'll directly use the matrix object created above.
        
        /* read */ double value = matrix.getEntry(0, 0); // Reading the first element (1.0)
        System.out.println(value);
    }
}