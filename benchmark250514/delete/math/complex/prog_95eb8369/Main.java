import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x3 matrix with some data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        
        // Create a RealMatrix object
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector to insert into the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Set the first row of the matrix to the new vector
        /* write */ matrix.setRowVector(0, rowVector);
        
        // Perform additional operations on the matrix
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0}
        });
        
        // Add two matrices
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Print out the result of the addition
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create another vector and perform dot product
        RealVector vector = new ArrayRealVector(new double[]{1.0, 0.5, -1.0});
        double dotProduct = rowVector.dotProduct(vector);
        System.out.println("Dot product of rowVector and vector: " + dotProduct);
        
        // Retrieve the modified row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print out the retrieved row vector
        System.out.println("Retrieved Row Vector: " + readVector);
        
        // Create a new matrix and multiply with the original matrix
        RealMatrix matrix3 = new Array2DRowRealMatrix(new double[][]{
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        });
        
        RealMatrix multipliedMatrix = matrix.multiply(matrix3);
        System.out.println("Matrix after multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}