import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        double[] vectorData = {5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);

        // Print the result of vector operation
        System.out.println("Result of matrix-vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Additional matrix operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);

        /* read */ double[][] matrixData = matrix.getData();

        // Print the matrix data
        System.out.println("Original matrix data:");
        for (double[] row : matrixData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}