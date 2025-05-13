import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Additional code to manipulate matrices and vectors
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix resultMatrix = matrix.add(identityMatrix);
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = resultMatrix.operate(vector);

        // Perform some operations on the result vector
        double sum = 0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        System.out.println("Sum of result vector entries: " + sum);

        // Additional matrix manipulation
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealMatrix subMatrix = scaledMatrix.getSubMatrix(0, 1, 0, 1);

        // Further operations on matrices
        double determinant = subMatrix.getDeterminant();
        System.out.println("Determinant of sub-matrix: " + determinant);

        /* read */ double[][] retrievedData = matrix.getData();

        // Output the data retrieved from the matrix
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}