import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Define a symmetric matrix using MatrixUtils
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.4},
            {0.3, 0.4, 1.0}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the retrieved matrix to verify the correct value
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}