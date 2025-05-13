import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal array
        double[] diagonal = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);

        // Create a vector for additional operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector multipliedVector = resultMatrix.operate(vector);

        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.println(multipliedVector.getEntry(i));
        }

        // Read the diagonal from the matrix
        /* read */ double[] readDiagonal = matrix.getRow(0);

        // Print the diagonal values
        System.out.println("Diagonal Values:");
        for (double value : readDiagonal) {
            System.out.println(value);
        }

        // Further operations on the diagonal matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix scaledMatrix = transposedMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}