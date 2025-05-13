import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize data for triangular matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        
        // Create another matrix for additional operations
        double[][] data2 = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        
        // Perform some operations on matrix2
        RealMatrix transposedMatrix2 = matrix2.transpose();
        RealMatrix multipliedMatrix2 = matrix2.multiply(transposedMatrix2);
        
        // Print the result of operations on matrix2
        System.out.println("Multiplied Matrix2:");
        for (int i = 0; i < multipliedMatrix2.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix2.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix2.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* write */ RealMatrix matrix = MatrixUtils.createTriangularMatrix(data);
        
        // Perform some unrelated operations
        double[][] data3 = {
            {16, 17, 18},
            {19, 20, 21},
            {22, 23, 24}
        };
        
        RealMatrix matrix3 = new Array2DRowRealMatrix(data3);
        RealMatrix addedMatrix3 = matrix3.add(matrix2);
        
        // Print the result of operations on matrix3
        System.out.println("Added Matrix3:");
        for (int i = 0; i < addedMatrix3.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix3.getColumnDimension(); j++) {
                System.out.print(addedMatrix3.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix triangularMatrix = MatrixUtils.getTriangularMatrix(matrix);
        
        // Print the triangular matrix
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < triangularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < triangularMatrix.getColumnDimension(); j++) {
                System.out.print(triangularMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}