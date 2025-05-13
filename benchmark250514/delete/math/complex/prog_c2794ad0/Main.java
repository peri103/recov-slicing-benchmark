import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some values
        double[][] matrixData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a row real vector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10, 11, 12});
        /* write */ matrix.setRowVector(1, rowVector); // Set the vector to the second row

        // Additional complex operations
        double[][] anotherMatrixData = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix resultMatrix = matrix.add(anotherMatrix);
        
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on the result matrix
        RealVector columnVector = resultMatrix.getColumnVector(0);
        System.out.println("First column of the result matrix: " + columnVector);
        
        // Read the row real vector using the read method
        /* read */ RealVector readRowVector = matrix.getRowVector(1);
        
        // Print the read values to verify the operation
        System.out.println("Read Row Vector: " + readRowVector);
        
        // Further operations
        RealMatrix transposedMatrix = resultMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}