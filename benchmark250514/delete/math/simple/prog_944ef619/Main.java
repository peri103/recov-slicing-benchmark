import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        /* read */ double[] readDiagonalValues = MatrixUtils.getDiagonalMatrix(matrix).getData();
        
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}