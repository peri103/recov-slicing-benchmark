import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Initialize a matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform matrix addition
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix sumMatrix = matrix.add(identityMatrix);
        
        // Print the resulting sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Extract and print the original matrix data
        /* read */ double[][] retrievedData = matrix.getData();
        System.out.println("Original Matrix Data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}