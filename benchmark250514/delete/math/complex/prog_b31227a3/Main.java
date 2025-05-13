import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and multiple columns
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{1.0, 1.0, 1.0}});
        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix: ");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            System.out.println(addedMatrix.getRowVector(i));
        }

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read Vector: " + readVector);

        // Create a diagonal matrix and print it
        RealMatrix diagonalMatrix = MatrixUtils.createRealDiagonalMatrix(new double[]{1.0, 2.0, 3.0});
        System.out.println("Diagonal Matrix: ");
        for (int i = 0; i < diagonalMatrix.getRowDimension(); i++) {
            System.out.println(diagonalMatrix.getRowVector(i));
        }

        // Perform some additional operations on vectors
        RealVector vectorSum = readVector.add(rowVector);
        System.out.println("Vector Sum: " + vectorSum);

        RealVector vectorDifference = readVector.subtract(rowVector);
        System.out.println("Vector Difference: " + vectorDifference);
    }
}