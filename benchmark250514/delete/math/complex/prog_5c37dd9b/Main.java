import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = symmetricMatrix.multiply(identityMatrix);
        
        // Create a vector and perform operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector transformedVector = resultMatrix.operate(vector);

        // Complex operation: sum of elements in the transformed vector
        double sum = 0;
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            sum += transformedVector.getEntry(i);
        }
        System.out.println("Sum of transformed vector elements: " + sum);
        
        // Add more matrix operations
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix addedMatrix = symmetricMatrix.add(transposedMatrix);

        // Further operations with matrices
        double[][] additionalData = {
            {0, 1, 2},
            {1, 0, 2},
            {2, 2, 0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix combinedMatrix = addedMatrix.add(anotherMatrix);

        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Display the matrix read from the symmetric matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Display the combined matrix
        System.out.println("Combined Matrix:");
        for (int i = 0; i < combinedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < combinedMatrix.getColumnDimension(); j++) {
                System.out.print(combinedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}