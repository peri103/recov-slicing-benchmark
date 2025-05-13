import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createRealMatrix(data);

        // Perform operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(transposedMatrix);

        // Create a vector and perform operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result vector
        System.out.println("Resulting Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Further matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = multipliedMatrix.add(identityMatrix);

        // Print the added matrix to verify
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix
        /* read */ RealMatrix readMatrix = symmetricMatrix;

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