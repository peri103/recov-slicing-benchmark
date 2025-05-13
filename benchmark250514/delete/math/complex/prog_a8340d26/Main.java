import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Create a RealMatrix from the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector to be written into the matrix
        double[] newRowData = {10.0, 11.0, 12.0};
        RealVector newRowVector = MatrixUtils.createRowRealVector(newRowData);

        // Perform some unrelated operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Create another matrix and perform matrix addition
        double[][] anotherData = {
            {2.0, 3.0, 4.0},
            {5.0, 6.0, 7.0},
            {8.0, 9.0, 10.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            System.out.println(addedMatrix.getRowVector(i));
        }

        // Write the new row vector into the matrix
        /* write */ matrix.setRowVector(0, newRowVector);

        // Perform some operations on vectors
        RealVector columnVector = matrix.getColumnVector(1);
        System.out.println("Column Vector:");
        System.out.println(columnVector);

        // Calculate the norm of the column vector
        double norm = columnVector.getNorm();
        System.out.println("Norm of the Column Vector: " + norm);

        // Read the row vector back from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the read row vector
        System.out.println("Read Row Vector:");
        System.out.println(readRowVector);

        // Perform a multiplication operation
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getRowVector(i));
        }
    }
}