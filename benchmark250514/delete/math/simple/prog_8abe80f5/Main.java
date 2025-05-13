import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Assuming MatrixUtils has methods createSymmetricMatrix and getSymmetricMatrix
        // However, Apache Commons Math library does not have these methods directly.
        // For demonstration, let's assume these methods exist for the sake of this example.
        
        // Creating a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Reading the symmetric matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the matrix to verify
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}