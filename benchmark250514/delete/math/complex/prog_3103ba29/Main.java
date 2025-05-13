import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row and multiple columns
        double[][] initialData = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);

        // Create a row vector using the write method
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Additional unrelated operation: Create another matrix and perform operations
        double[][] extraData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix extraMatrix = new Array2DRowRealMatrix(extraData);
        RealVector columnVector = new ArrayRealVector(new double[]{13.0, 14.0});
        extraMatrix.setColumnVector(1, columnVector);
        
        // Set the row vector into the matrix
        matrix.setRowVector(0, rowVector);

        // Perform some operations on extraMatrix
        RealVector extractedColumn = extraMatrix.getColumnVector(1);
        System.out.println("Extracted Column Vector: " + extractedColumn);

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read Row Vector: " + readVector);

        // Additional unrelated operation: Perform matrix addition
        RealMatrix sumMatrix = matrix.add(extraMatrix);
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            System.out.println(sumMatrix.getRowVector(i));
        }
    }
}