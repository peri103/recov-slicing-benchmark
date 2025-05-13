import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);
        
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);
        
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}