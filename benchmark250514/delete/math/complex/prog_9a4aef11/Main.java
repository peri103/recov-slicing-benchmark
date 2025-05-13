import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},
            {3.0, 6.0, 9.0}
        };
        
        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Initialize a vector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix
        double[][] anotherData = {
            {4.0, 5.0, 6.0},
            {5.0, 7.0, 8.0},
            {6.0, 8.0, 10.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createSymmetricMatrix(anotherData);

        // Perform matrix addition
        RealMatrix sumMatrix = symmetricMatrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the read matrix
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}