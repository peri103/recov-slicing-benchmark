import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3 for demonstration
        RealMatrix baseMatrix = MatrixUtils.createRealMatrix(3, 3);
        SymmetricMatrix matrix = new SymmetricMatrix(baseMatrix);
        
        // Set an entry in the symmetric matrix
        /* write */ matrix.setEntry(1, 1, 5.0);
        
        // Get the entry from the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to verify correctness
        System.out.println(value);
    }
}