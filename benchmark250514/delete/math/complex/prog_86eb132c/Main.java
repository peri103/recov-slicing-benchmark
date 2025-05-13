import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a column vector
        double[][] columnData = {{1.0}, {2.0}, {3.0}};

        // Create a column matrix using the write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Perform additional operations unrelated to the read-write pair
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = columnMatrix.operate(vector);

        // Print the result of the matrix-vector multiplication
        System.out.println("Result of Matrix-Vector Multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Initialize another matrix and perform matrix addition
        RealMatrix anotherMatrix = MatrixUtils.createColumnRealMatrix(new double[][]{{7.0}, {8.0}, {9.0}});
        RealMatrix addedMatrix = columnMatrix.add(anotherMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            System.out.println(addedMatrix.getEntry(i, 0));
        }

        // Read the column matrix using the read method
        /* read */ RealMatrix readColumnMatrix = columnMatrix.getColumnMatrix(0);

        // Print the read column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println(readColumnMatrix.getEntry(i, 0));
        }

        // Perform a scalar multiplication on the read matrix
        RealMatrix scaledMatrix = readColumnMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getEntry(i, 0));
        }
    }
}