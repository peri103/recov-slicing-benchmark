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
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Create another matrix for additional operations
        double[][] data2 = {
            {7, 8, 9},
            {8, 10, 11},
            {9, 11, 12}
        };
        RealMatrix anotherMatrix = MatrixUtils.createSymmetricMatrix(data2);
        
        // Perform matrix multiplication
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(anotherMatrix);
        
        // Create a vector for operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Multiply matrix with vector
        RealVector resultVector = multipliedMatrix.operate(vector);
        
        // Print result vector
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Calculate trace of the multiplied matrix
        double trace = multipliedMatrix.getTrace();
        System.out.println("Trace of the multiplied matrix: " + trace);
        
        // Assuming getSymmetricMatrix retrieves the matrix created
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the retrieved matrix to verify the operation
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}