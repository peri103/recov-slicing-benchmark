import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for demonstration
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });

        // Perform some operations on the second matrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        RealMatrix multipliedMatrix = anotherMatrix.multiply(transposedMatrix);

        // Write: create a row real vector
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the row vector into the matrix at row index 0
        matrix.setRowVector(0, rowVector);

        // Perform operations using the multiplied matrix
        RealVector vectorFromMultipliedMatrix = multipliedMatrix.getRowVector(0);
        System.out.println("Vector from multiplied matrix: " + vectorFromMultipliedMatrix);

        // Read: get the row real vector from the matrix at row index 0
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read vector from original matrix: " + readRowVector);

        // Additional operations on the original matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealVector scaledRowVector = scaledMatrix.getRowVector(0);
        System.out.println("Scaled row vector: " + scaledRowVector);
    }
}