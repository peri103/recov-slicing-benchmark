import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 symmetric matrix
        double[][] data = {
            {1.0, 0.5},
            {0.5, 1.0}
        };
        
        // Create a symmetric matrix using the MatrixUtils class
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Read the symmetric matrix using the MatrixUtils class
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Output the matrix to verify the read operation
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}