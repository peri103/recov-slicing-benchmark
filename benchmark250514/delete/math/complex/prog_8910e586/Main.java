import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.6},
            {0.3, 0.6, 1.0}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Perform some unrelated operations to make the program more complex
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = symmetricMatrix.operate(vector);
        
        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // More unrelated operations
        double[][] additionalData = {
            {2.0, 1.0, 0.5},
            {1.0, 2.0, 1.5},
            {0.5, 1.5, 2.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix sumMatrix = symmetricMatrix.add(additionalMatrix);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the matrix to verify the read operation
        System.out.println("Read symmetric matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}