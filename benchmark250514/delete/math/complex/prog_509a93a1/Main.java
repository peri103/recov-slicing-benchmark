import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        // Create a symmetric matrix using the write method
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Additional operations with matrices and vectors
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {7, 8, 9},
            {8, 10, 11},
            {9, 11, 12}
        });
        
        RealMatrix sumMatrix = symmetricMatrix.add(anotherMatrix);
        
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = sumMatrix.operate(vector);
        
        System.out.println("Resulting vector after matrix operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
        
        // Read the symmetric matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the read matrix to verify
        System.out.println("Read symmetric matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // More complex operations
        double determinant = readMatrix.getDeterminant();
        System.out.println("Determinant of the read matrix: " + determinant);
        
        RealMatrix inverseMatrix = MatrixUtils.inverse(readMatrix);
        System.out.println("Inverse of the read matrix:");
        for (int i = 0; i < inverseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < inverseMatrix.getColumnDimension(); j++) {
                System.out.print(inverseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}