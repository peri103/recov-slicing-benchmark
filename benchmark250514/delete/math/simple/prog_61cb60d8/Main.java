import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0}; // Example diagonal values
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        /* read */ double[] retrievedDiagonal = matrix.getRow(0); // Assuming getDiagonalMatrix() returns the first row as diagonal
        for (double value : retrievedDiagonal) {
            System.out.println(value);
        }
    }
}