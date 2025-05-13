import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix with some values
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {1.0, 1.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Create another matrix and perform addition
        double[][] data2 = { {5.0, 6.0}, {7.0, 8.0} };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealMatrix sumMatrix = matrix.add(matrix2);
        
        // Print the resulting matrix after addition
        System.out.println("Resulting matrix after addition:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Read the original matrix and retrieve a specific value to ensure the write was successful
        /* read */ RealMatrix readMatrix = MatrixUtils.getRealMatrix(matrix.getData());
        
        // Print the value at position (0, 0) to verify the read operation
        System.out.println("Value at (0, 0) in the original matrix: " + readMatrix.getEntry(0, 0));
    }
}