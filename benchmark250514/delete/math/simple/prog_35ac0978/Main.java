import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 1, 0, 1);
        
        System.out.println("Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}