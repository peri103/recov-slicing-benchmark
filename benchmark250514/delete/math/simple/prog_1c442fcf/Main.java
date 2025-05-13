import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with a size of 3x3
        double[][] data = {
            {0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0},
            {0.0, 0.0, 0.0}
        };
        SymmetricMatrix matrix = new SymmetricMatrix(MatrixUtils.createRealMatrix(data));

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 1, 5.0);

        // Read the value from the matrix
        /* read */ double value = matrix.getEntry(1, 1);

        // Output the read value
        System.out.println(value);
    }
}