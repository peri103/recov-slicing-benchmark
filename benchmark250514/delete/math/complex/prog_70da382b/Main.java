import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array to be used for matrix creation
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a RealVector using ArrayRealVector
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        
        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
        
        // Using MatrixUtils to create a RealMatrix from the 2D array
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);
        
        // Create another matrix for addition
        RealMatrix anotherMatrix = MatrixUtils.createArray2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}});
        
        // Add the two matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify it matches the original data
        System.out.println("Retrieved Matrix Data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}