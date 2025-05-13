import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with zeros
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        
        // Initialize another matrix and perform some operations
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });
        
        double determinant = matrix2.getDeterminant();
        System.out.println("Determinant of matrix2: " + determinant);
        
        RealMatrix matrix3 = matrix2.scalarMultiply(2.0);
        System.out.println("Matrix3 after scalar multiplication:");
        for (int i = 0; i < matrix3.getRowDimension(); i++) {
            for (int j = 0; j < matrix3.getColumnDimension(); j++) {
                System.out.print(matrix3.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Write a value into the matrix at position (1, 1)
        /* write */ matrix.setEntry(1, 1, 5.5);
        
        // Perform some unrelated mathematical operations
        double sum = 0;
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            for (int j = 0; j < matrix2.getColumnDimension(); j++) {
                sum += matrix2.getEntry(i, j);
            }
        }
        System.out.println("Sum of elements in matrix2: " + sum);
        
        RealMatrix matrix4 = matrix2.transpose();
        System.out.println("Matrix4 (transpose of matrix2):");
        for (int i = 0; i < matrix4.getRowDimension(); i++) {
            for (int j = 0; j < matrix4.getColumnDimension(); j++) {
                System.out.print(matrix4.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the value from the matrix at position (1, 1)
        /* read */ double value = matrix.getEntry(1, 1);
        
        // Print the value to ensure it was correctly read
        System.out.println("Read value from matrix: " + value);
    }
}