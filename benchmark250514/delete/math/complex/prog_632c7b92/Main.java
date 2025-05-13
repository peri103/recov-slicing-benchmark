import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create the matrix
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector
        double[] rowData = {1, 2, 3};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Set the row vector to the first row of the matrix
        matrix.setRowVector(0, rowVector);

        // Additional operations using RealMatrix
        double[][] additionalData = {
            {4, 5, 6},
            {7, 8, 9}
        };
        
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        
        // Perform operations on matrices
        RealMatrix multipliedMatrix = resultMatrix.scalarMultiply(2.0);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the first row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the read row vector
        System.out.println("Read Row Vector: " + readRowVector);

        // More complex operations
        RealVector columnVector = matrix.getColumnVector(1);
        System.out.println("Column Vector: " + columnVector);
        
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}