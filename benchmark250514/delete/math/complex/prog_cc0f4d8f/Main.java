import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a vector to be written into the matrix
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = MatrixUtils.createRowRealVector(vectorData);

        // Additional matrix operations
        double[][] additionalMatrixData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);

        // Perform a matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(additionalMatrix);

        // Display the result of matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int row = 0; row < resultMatrix.getRowDimension(); row++) {
            for (int col = 0; col < resultMatrix.getColumnDimension(); col++) {
                System.out.print(resultMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Write the vector into the original matrix
        /* write */ matrix.setRowVector(0, vector);

        // Perform some unrelated vector operations
        RealVector anotherVector = vector.mapMultiply(2.0);
        System.out.println("Another vector after multiplication:");
        for (int i = 0; i < anotherVector.getDimension(); i++) {
            System.out.print(anotherVector.getEntry(i) + " ");
        }
        System.out.println();

        // More matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read the vector back from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read vector from matrix:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}