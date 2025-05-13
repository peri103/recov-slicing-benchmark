import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a RealMatrix from the 2D array
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector using createColumnRealVector
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{5.0, 6.0});
        
        // Perform some unrelated operations on the matrix
        double[][] additionalData = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        
        // Print the result of the matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Set the column vector to the matrix at column index 1
        matrix.setColumnVector(1, columnVector);
        
        // Perform some unrelated operations using the matrix
        double[] rowSum = new double[matrix.getRowDimension()];
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            rowSum[i] = matrix.getRowVector(i).getSum();
        }
        
        // Print the sum of each row
        System.out.println("Sum of each row:");
        for (double sum : rowSum) {
            System.out.println(sum);
        }
        
        // Retrieve the column vector from the matrix
        /* read */ RealVector retrievedVector = matrix.getColumnVector(1);
        
        // Print the retrieved vector to verify
        System.out.println("Retrieved column vector:");
        System.out.println(retrievedVector);
        
        // Perform some more unrelated operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}