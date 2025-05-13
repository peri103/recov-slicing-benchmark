import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one column
        double[][] matrixData = {{0}, {0}, {0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a column vector
        double[] columnData = {1, 2, 3};
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);

        // Some unrelated operations on matrices
        double[][] additionalMatrixData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);

        // Perform matrix multiplication
        RealMatrix resultMatrix = additionalMatrix.multiply(additionalMatrix.transpose());
        System.out.println("Result of matrix multiplication:");
        System.out.println(resultMatrix);

        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // More unrelated operations
        double[] anotherColumnData = {4, 5, 6};
        RealVector anotherColumnVector = MatrixUtils.createColumnRealVector(anotherColumnData);
        matrix.setColumnVector(0, anotherColumnVector);

        // Read the column vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the vector to verify the values
        System.out.println("Read column vector:");
        System.out.println(readColumnVector);

        // Additional operations on vectors
        RealVector sumVector = columnVector.add(anotherColumnVector);
        System.out.println("Sum of column vectors:");
        System.out.println(sumVector);
    }
}