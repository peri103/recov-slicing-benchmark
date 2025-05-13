import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
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

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = symmetricMatrix.multiply(identityMatrix);
        
        // Create and manipulate a vector
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = productMatrix.operate(vector);
        
        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Additional matrix operations
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix addedMatrix = symmetricMatrix.add(transposedMatrix);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the matrix to verify
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}