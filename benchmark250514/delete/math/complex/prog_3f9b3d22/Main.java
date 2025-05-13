import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with sample data
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Create a triangular matrix using the MatrixUtils class
        RealMatrix triangularMatrix;
        /* write */ triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = identityMatrix.multiply(triangularMatrix);

        // Create a vector and perform operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Print the result of vector operations
        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More unrelated operations
        RealMatrix addedMatrix = triangularMatrix.add(identityMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using the MatrixUtils class
        RealMatrix readMatrix;
        /* read */ readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}