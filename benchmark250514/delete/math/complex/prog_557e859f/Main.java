import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize column data
        double[] columnData = {1.0, 2.0, 3.0}; 
        
        // Initialize another matrix for additional operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Create a matrix using Array2DRowRealMatrix
        RealMatrix matrix2 = new Array2DRowRealMatrix(matrixData);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix2.add(matrix2);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create a column matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform some unrelated operations
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the column matrix using MatrixUtils
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Print the values to verify correctness
        System.out.println("Column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}