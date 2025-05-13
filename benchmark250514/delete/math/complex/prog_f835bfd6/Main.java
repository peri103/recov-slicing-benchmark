import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a row real matrix
        double[][] data = { { 1.0, 2.0, 3.0 } };
        
        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Create another matrix for demonstration
        double[][] data2 = { { 4.0, 5.0, 6.0 }, { 7.0, 8.0, 9.0 } };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        
        // Perform some operations on matrix2
        RealMatrix transposedMatrix2 = matrix2.transpose();
        System.out.println("Transposed Matrix2:");
        for (int i = 0; i < transposedMatrix2.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix2.getColumnDimension(); j++) {
                System.out.print(transposedMatrix2.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create a real vector for additional operations
        double[] vectorData = { 1.0, 2.0, 3.0 };
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Multiply the vector with the original matrix
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Read the row real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the matrix to verify
        System.out.println("Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform additional operations
        RealMatrix addedMatrix = matrix.add(matrix2);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}