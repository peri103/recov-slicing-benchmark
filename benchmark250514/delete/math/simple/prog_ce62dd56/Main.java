import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */
        RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        /* read */
        RealMatrix readMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        double[] readDiagonalValues = readMatrix.getColumn(0);
        
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}