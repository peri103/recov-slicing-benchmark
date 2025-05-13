import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with example values
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };

        // Create a triangular matrix using the given data
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Additional matrix operations to increase complexity
        double[][] additionalData = {
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };

        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix sumMatrix = triangularMatrix.add(additionalMatrix);

        // Perform some operations on the sumMatrix
        double[][] resultData = new double[sumMatrix.getRowDimension()][sumMatrix.getColumnDimension()];
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                resultData[i][j] = sumMatrix.getEntry(i, j) * 2;
            }
        }

        RealMatrix resultMatrix = new Array2DRowRealMatrix(resultData);

        // Retrieve the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the retrieved matrix
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}