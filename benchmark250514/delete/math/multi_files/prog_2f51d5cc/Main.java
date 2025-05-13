import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrices
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 3.0, 0.0},
            {4.0, 5.0, 6.0}
        };

        double[][] otherData = {
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };

        // Initialize the handler and operations
        TriangularMatrixHandler handler = new TriangularMatrixHandler();
        MatrixOperations operations = new MatrixOperations();

        // Create a triangular matrix
        handler.createMatrix(data);

        // Perform operations with another matrix
        RealMatrix otherMatrix = new Array2DRowRealMatrix(otherData);
        RealMatrix addedMatrix = operations.addMatrices(handler.getMatrix(), otherMatrix);

        // Create a vector and perform multiplication
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector resultVector = operations.multiplyMatrixVector(addedMatrix, vectorData);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the triangular matrix using the handler
        /* read */ RealMatrix readMatrix = handler.getMatrix();

        // Print the read matrix to verify the operation
        System.out.println("Read triangular matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}