import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and some columns
        double[][] matrixData = {{1.0, 2.0, 3.0, 4.0, 5.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector using createRowRealVector and write it to the first row of the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{10.0, 20.0, 30.0, 40.0, 50.0});
        /* write */ matrix.setRowVector(0, vector);

        // Create another matrix and perform operations
        double[][] anotherMatrixData = {{6.0, 7.0, 8.0}, {9.0, 10.0, 11.0}, {12.0, 13.0, 14.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);

        // Add the matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Multiply the matrices
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some operations before reading the vector
        double[] scalarMultiplicationResult = vector.mapMultiply(2.0).toArray();
        System.out.println("Scalar Multiplication Result:");
        for (double val : scalarMultiplicationResult) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Read the RealVector from the first row of the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read Vector: " + readVector);

        // Print the product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}