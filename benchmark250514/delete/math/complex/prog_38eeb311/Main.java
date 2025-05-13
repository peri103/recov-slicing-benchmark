import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix for demonstration purposes
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another row vector and set it to the matrix
        RealVector anotherRowVector = new ArrayRealVector(new double[]{10.0, 11.0, 12.0});
        matrix.setRowVector(1, anotherRowVector);

        // Use the write method to create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{13.0, 14.0, 15.0});
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform some matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Calculate the sum of each row in the multiplied matrix
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            RealVector row = multipliedMatrix.getRowVector(i);
            double sum = row.getL1Norm();
            System.out.println("Sum of row " + i + ": " + sum);
        }

        // Use the read method to get the row vector
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector to verify the operations
        System.out.println("Read Vector: " + readVector);

        // Create a new matrix and perform addition
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(new double[][]{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}});
        RealMatrix resultMatrix = matrix.add(additionalMatrix);

        // Print the result matrix
        System.out.println("Result Matrix after Addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            System.out.println(resultMatrix.getRowVector(i));
        }
    }
}