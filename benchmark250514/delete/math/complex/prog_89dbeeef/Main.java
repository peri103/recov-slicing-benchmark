import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with a single column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector using the write method
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);
        
        // Perform operations on the matrix
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}});
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix:");
        printMatrix(sumMatrix);
        
        // Perform operations on vectors
        RealVector anotherVector = new ArrayRealVector(new double[]{16.0, 17.0, 18.0});
        RealVector combinedVector = columnVector.add(anotherVector);
        System.out.println("Combined Vector:");
        printVector(combinedVector);
        
        // Retrieve the RealVector using the read method
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);
        
        // Print the retrieved vector
        System.out.println("Retrieved Vector:");
        printVector(retrievedVector);
        
        // Further matrix operations
        RealMatrix transposedMatrix = sumMatrix.transpose();
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }
    
    // Helper method to print matrix
    public static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
    
    // Helper method to print vector
    public static void printVector(RealVector vector) {
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println();
    }
}