import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        SymmetricMatrixUtils matrixUtils = new SymmetricMatrixUtils();
        MatrixOperations matrixOps = new MatrixOperations();

        // Create a symmetric matrix
        double[][] data = { {1, 2}, {2, 3} };
        matrixUtils.createSymmetricMatrix(data);

        // Create another matrix for operations
        double[][] data2 = { {4, 5}, {6, 7} };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrixOps.addMatrices(matrixUtils.getSymmetricMatrix(), matrix2);

        // Create a vector and perform matrix-vector multiplication
        double[] vectorData = {1, 1};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrixOps.multiplyMatrixVector(resultMatrix, vector);

        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = matrixUtils.getSymmetricMatrix();

        // Perform matrix multiplication with the symmetric matrix
        RealMatrix finalResultMatrix = matrixOps.multiplyMatrices(symmetricMatrix, matrix2);

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