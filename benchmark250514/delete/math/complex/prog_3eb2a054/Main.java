import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrix operations
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        double[][] additionalData = { {5.0, 6.0}, {7.0, 8.0} };

        // Create a RealMatrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Perform some matrix operations
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);

        // Initialize a RealVector for vector operations
        double[] vectorData = { 9.0, 10.0 };
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply matrix with vector
        RealVector resultVector = matrix.operate(vector);

        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform more matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Read data from the matrix using the read method
        /* read */ double[][] array = matrix.getData();

        // Print the matrix to verify the read operation
        System.out.println("Original Matrix Data:");
        for (double[] row : array) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Print additional matrix operations results
        System.out.println("Resulting Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}