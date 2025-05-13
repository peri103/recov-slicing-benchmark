import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a RealVector from a row of the matrix
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(matrixData[1]);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Create a new matrix and perform element-wise addition
        double[][] anotherMatrixData = {
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Set the row vector back to the matrix at the same row index
        matrix.setRowVector(1, rowVector);

        // Perform some operations on the addedMatrix
        RealMatrix subtractedMatrix = addedMatrix.subtract(matrix);
        double determinant = subtractedMatrix.getDeterminant();
        
        // Read the row vector back from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the read vector
        System.out.println("Read Vector: " + readVector);

        // Print the determinant of the subtracted matrix
        System.out.println("Determinant of Subtracted Matrix: " + determinant);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}