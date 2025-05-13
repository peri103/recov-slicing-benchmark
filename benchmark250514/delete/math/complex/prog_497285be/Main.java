import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using the write method
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Additional unrelated code to make the program more complex
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector vector2 = new ArrayRealVector(new double[]{4, 5, 6});
        RealVector resultVector = vector.add(vector2);
        
        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(identityMatrix);

        // Perform a matrix operation
        RealMatrix transposedMatrix = multipliedMatrix.transpose();

        // Additional operations
        double determinant = transposedMatrix.getDeterminant();
        System.out.println("Determinant of Transposed Matrix: " + determinant);

        // Read the symmetric matrix using the read method
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More complex operations
        RealMatrix addedMatrix = retrievedMatrix.add(identityMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}