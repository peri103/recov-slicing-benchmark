import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the symmetric matrix
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.6},
            {0.3, 0.6, 1.0}
        };

        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Create a vector to perform operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Get the symmetric matrix using MatrixUtils
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved symmetric matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Calculate the determinant of the matrix
        double determinant = symmetricMatrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);
    }
}