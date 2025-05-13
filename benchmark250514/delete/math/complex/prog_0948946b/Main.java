import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix data
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        // Create a symmetric matrix using the write method
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Create another matrix to perform operations
        double[][] otherData = {
            {4, 5, 6},
            {5, 8, 9},
            {6, 9, 12}
        };
        RealMatrix otherMatrix = new Array2DRowRealMatrix(otherData);

        // Perform matrix addition
        RealMatrix addedMatrix = symmetricMatrix.add(otherMatrix);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(otherMatrix);

        // Print the matrices to verify operations
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the read matrix to verify it matches the written matrix
        System.out.println("Read Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}