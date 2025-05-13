import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixFormat;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Additional operations on matrices
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealMatrix resultMatrix = matrix.add(MatrixUtils.createRealMatrix(new double[][] {
            {0.0, 1.0, 0.0},
            {1.0, 0.0, 1.0},
            {0.0, 1.0, 0.0}
        }));

        RealVector multipliedVector = resultMatrix.operate(vector);
        
        // Formatting and printing the matrix
        RealMatrixFormat matrixFormat = new RealMatrixFormat();
        System.out.println("Formatted Matrix:");
        System.out.println(matrixFormat.format(resultMatrix));

        // Perform some unrelated calculations
        double sum = 0.0;
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            sum += multipliedVector.getEntry(i);
        }
        System.out.println("Sum of vector entries: " + sum);

        // More unrelated code
        double product = 1.0;
        for (double value : diagonalValues) {
            product *= value;
        }
        System.out.println("Product of diagonal values: " + product);

        // Reading the diagonal values from the matrix
        /* read */ double[] readDiagonalValues = MatrixUtils.getDiagonalMatrix(matrix).getData();
        
        for (double value : readDiagonalValues) {
            System.out.println("Read diagonal value: " + value);
        }
    }
}