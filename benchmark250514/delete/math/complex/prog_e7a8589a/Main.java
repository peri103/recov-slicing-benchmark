import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = { {1, 2}, {2, 3} };
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create another matrix for operations
        double[][] data2 = { {4, 5}, {6, 7} };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Create a vector and perform matrix-vector multiplication
        double[] vectorData = {1, 1};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = resultMatrix.operate(vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);

        // Perform matrix multiplication with the symmetric matrix
        RealMatrix finalResultMatrix = symmetricMatrix.multiply(matrix2);

        // Print the final result matrix
        System.out.println("Final Result Matrix:");
        for (int i = 0; i < finalResultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < finalResultMatrix.getColumnDimension(); j++) {
                System.out.print(finalResultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}