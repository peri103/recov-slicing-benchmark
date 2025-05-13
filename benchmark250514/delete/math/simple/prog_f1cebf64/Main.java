import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        /* read */ RealMatrix diagonalMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        for (int i = 0; i < diagonalMatrix.getRowDimension(); i++) {
            System.out.println(diagonalMatrix.getEntry(i, i));
        }
    }
}