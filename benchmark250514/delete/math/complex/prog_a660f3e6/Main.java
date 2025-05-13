import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the matrix
        double[][] data = {{1}, {2}, {3}};

        // Create a column real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(new double[]{1, 2, 3});

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);

        // Create another matrix and perform operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{4}, {5}, {6}});
        RealMatrix sumMatrix = multipliedMatrix.add(anotherMatrix);

        // Extract a row vector from the sumMatrix
        RealVector rowVector = sumMatrix.getRowVector(0);
        System.out.println("Row Vector: " + rowVector);

        // Read the column real matrix using the MatrixUtils class
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(data, 0);

        // Print the column matrix to verify the read operation
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }

        // Perform additional operations
        RealMatrix scaledMatrix = sumMatrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}