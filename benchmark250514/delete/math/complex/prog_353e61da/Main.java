import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for symmetric matrix
        double[][] symmetricData = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        // Initialize a vector for unrelated operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform some vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        double vectorNorm = scaledVector.getNorm();
        System.out.println("Scaled Vector Norm: " + vectorNorm);

        // Initialize another matrix for operations
        double[][] otherMatrixData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        RealMatrix otherMatrix = MatrixUtils.createRealMatrix(otherMatrixData);
        
        // Perform matrix operations
        RealMatrix transposedMatrix = otherMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(symmetricData);
        
        // Perform operations on symmetric matrix
        RealMatrix multipliedMatrix = symmetricMatrix.scalarMultiply(2.0);
        System.out.println("Multiplied Symmetric Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the retrieved symmetric matrix to verify
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}