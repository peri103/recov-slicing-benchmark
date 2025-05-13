import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonal = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix is intended to retrieve the diagonal
        for (double value : retrievedDiagonal) {
            System.out.print(value + " ");
        }
    }
}