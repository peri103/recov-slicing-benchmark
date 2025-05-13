import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent the matrix
        double[][] data = {
            {1.0, 2.0},
            {2.0, 3.0}
        };

        // Create a symmetric matrix using the write method
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(transposedMatrix);

        // Create a vector and perform operations with the matrix
        double[] vectorData = {1.0, 2.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = multipliedMatrix.operate(vector);

        // Initialize another matrix and perform operations
        double[][] anotherData = {
            {4.0, 5.0},
            {5.0, 6.0}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix addedMatrix = symmetricMatrix.add(anotherMatrix);

        // Read the symmetric matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the read matrix to verify the output
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the result of matrix-vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

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