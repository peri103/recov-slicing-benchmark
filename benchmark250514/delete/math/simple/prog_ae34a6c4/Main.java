import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1, 2, 3};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        /* read */ double[] readValues = matrix.getColumn(0); // Assuming getDiagonalMatrix is a method to retrieve the diagonal
        
        for (double value : readValues) {
            System.out.println(value);
        }
    }
}