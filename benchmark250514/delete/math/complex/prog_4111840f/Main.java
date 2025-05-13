import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a matrix using the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row real vector using the createRowRealVector method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});

        // Set the row vector into the matrix at a specific row index
        matrix.setRowVector(1, rowVector);

        // Perform some unrelated operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create another matrix for additional operations
        double[][] newData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        };
        RealMatrix newMatrix = new Array2DRowRealMatrix(newData);

        // Add the new matrix to the existing matrix
        RealMatrix addedMatrix = matrix.add(newMatrix);

        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector using the getRowRealVector method
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector to verify it matches the written vector
        System.out.println("Read Vector: " + readVector);

        // Perform some operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}