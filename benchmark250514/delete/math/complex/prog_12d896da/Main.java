import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 4.0, 5.0},
            {3.0, 5.0, 6.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create another matrix and perform operations
        double[][] data2 = {
            {7.0, 8.0, 9.0},
            {8.0, 10.0, 11.0},
            {9.0, 11.0, 12.0}
        };
        
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealMatrix sumMatrix = matrix.add(matrix2);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = sumMatrix.operate(vector);
        
        // Perform some calculations with the vector
        double[] vectorData = resultVector.toArray();
        double sum = 0;
        for (double val : vectorData) {
            sum += val;
        }
        System.out.println("Sum of vector elements: " + sum);
        
        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(matrix);
        
        // Print the matrix to verify
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Additional operations with matrices
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}