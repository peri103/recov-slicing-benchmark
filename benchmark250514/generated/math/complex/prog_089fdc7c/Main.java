import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create a new matrix and perform some operations
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data);
        
        // Add the two matrices
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Create a vector and multiply with matrix
        double[] vectorData = {1.0, 0.5, 0.25};
        RealVector vector = MatrixUtils.createRealVector(vectorData);
        RealVector resultVector = resultMatrix.preMultiply(vector);
        
        // Print the result of vector multiplication
        System.out.println("Result of vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform some more operations on matrix2
        RealMatrix transposedMatrix = matrix2.transpose();
        System.out.println("Transposed matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Original read operation
        /* read */ RealMatrix rowMatrix = matrix.getRowMatrix(0);
        
        // Print the row matrix to verify the read operation
        System.out.println("Row matrix:");
        for (int i = 0; i < rowMatrix.getColumnDimension(); i++) {
            System.out.print(rowMatrix.getEntry(0, i) + " ");
        }
    }
}