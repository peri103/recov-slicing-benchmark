import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a row matrix with a single row of data
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */
        RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create another matrix and perform some operations
        double[][] data2 = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        
        // Add the two matrices
        RealMatrix resultMatrix = matrix.add(matrix2.getSubMatrix(0, 0, 0, 2));
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});
        RealVector resultVector = vector.mapMultiply(2.0);
        
        // Print the result of matrix addition
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < rowData.length; i++) {
            sum += rowData[i] * 2;
        }
        System.out.println("Sum of doubled rowData: " + sum);
        
        /* read */
        RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the retrieved matrix to verify its contents
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}