import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initial data for the first matrix row
        double[] data = {1.0, 2.0, 3.0}; 
        
        // Create another matrix and perform operations
        double[][] matrixData = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{10.0, 11.0, 12.0});
        RealVector resultVector = anotherMatrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform some more matrix operations
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original write operation
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Some complex operations in between
        RealMatrix multipliedMatrix = anotherMatrix.multiply(transposedMatrix);
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Original read operation
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        // Print the matrix row to verify the value
        System.out.println("Original matrix row:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}