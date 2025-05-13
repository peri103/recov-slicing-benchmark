import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},
            {3.0, 6.0, 9.0}
        };

        // Create a symmetric matrix using the MatrixUtils class
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform some unrelated operations with vectors
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Scale the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Add the vector to itself
        RealVector addedVector = vector.add(vector);
        System.out.println("Added Vector: " + addedVector);

        // Calculate the norm of the vector
        double norm = vector.getNorm();
        System.out.println("Vector Norm: " + norm);

        // More operations on the matrix before reading
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using the MatrixUtils class
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify
        System.out.println("Original Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}