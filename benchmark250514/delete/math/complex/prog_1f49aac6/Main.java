import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Adding some unrelated operations
        RealVector vector = new ArrayRealVector(new double[] {5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of vector operation
        System.out.println("Result of vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More operations on the matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);

        // Modify the matrix by scaling
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getDataRef(), 0, 0, 2, 2);

        // Print the originally read matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}