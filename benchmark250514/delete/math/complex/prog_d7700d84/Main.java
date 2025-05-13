import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with sample data
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.4},
            {0.3, 0.4, 1.0}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Additional operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for additional operations
        double[][] data2 = {
            {2.0, 0.0, 1.0},
            {0.0, 2.0, 0.0},
            {1.0, 0.0, 2.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(data2);

        // Perform matrix addition
        RealMatrix sumMatrix = symmetricMatrix.add(anotherMatrix);
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Now read the symmetric matrix
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