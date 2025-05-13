import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used with the write method
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Use the write method to create a RealMatrix
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = transposedMatrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Use the read method to retrieve the data from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved data to verify correctness
        System.out.println("Retrieved matrix data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        // Further operations with the matrix
        RealMatrix addedMatrix = matrix.add(transposedMatrix);
        System.out.println("Matrix after addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}