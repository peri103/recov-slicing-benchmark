import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createTriangularMatrix(data);
        /* read */ RealMatrix triangularMatrix = MatrixUtils.getTriangularMatrix(matrix);
        
        for (int i = 0; i < triangularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < triangularMatrix.getColumnDimension(); j++) {
                System.out.print(triangularMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}