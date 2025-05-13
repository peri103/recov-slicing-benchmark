import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Create a vector
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform some matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Create another matrix for additional operations
        double[][] additionalData = {
            {4, 5, 6},
            {5, 8, 9},
            {6, 9, 12}
        };
        RealMatrix additionalMatrix = MatrixUtils.createSymmetricMatrix(additionalData);
        
        // Add the two matrices
        RealMatrix sumMatrix = symmetricMatrix.add(additionalMatrix);

        // Print the sum matrix
        System.out.println("Sum matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the read matrix
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some additional calculations
        RealMatrix multipliedMatrix = readMatrix.multiply(additionalMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}