import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = { {1, 2}, {2, 3} };
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);

        // Print the symmetric matrix
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}