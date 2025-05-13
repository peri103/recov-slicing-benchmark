import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.2},
            {0.3, 0.2, 1.0}
        };
        
        // Use MatrixUtils to create a symmetric matrix
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Perform additional operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(data.length);
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(identityMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {2.0, 3.0, 4.0});
        RealVector resultVector = multipliedMatrix.operate(vector);
        
        // Print the resulting vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Use MatrixUtils to get the symmetric matrix (assuming getSymmetricMatrix is a valid method)
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the retrieved matrix to verify the operation
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform additional matrix operations
        RealMatrix transposedMatrix = retrievedMatrix.transpose();
        RealMatrix addedMatrix = retrievedMatrix.add(transposedMatrix);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}