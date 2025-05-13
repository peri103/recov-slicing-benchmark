import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        /* read */ RealMatrix diagonalMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        System.out.println("Diagonal Matrix:");
        for (int i = 0; i < diagonalMatrix.getRowDimension(); i++) {
            for (int j = 0; j < diagonalMatrix.getColumnDimension(); j++) {
                System.out.print(diagonalMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}