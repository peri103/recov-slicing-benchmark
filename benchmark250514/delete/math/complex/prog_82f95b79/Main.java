import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array for matrix creation
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };

        // Create a matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Perform some additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector vector = new ArrayRealVector(new double[] {5.0, 6.0});
        RealVector resultVector = transposedMatrix.operate(vector);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of the matrix-vector multiplication
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the matrix using the read method
        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved matrix data
        System.out.println("Retrieved Matrix:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Perform additional operations with another vector
        RealVector anotherVector = new ArrayRealVector(new double[] {7.0, 8.0});
        RealVector combinedVector = resultVector.add(anotherVector);

        // Print the combined vector
        System.out.println("Combined Vector:");
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            System.out.print(combinedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}