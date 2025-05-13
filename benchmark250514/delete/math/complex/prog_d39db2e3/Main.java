import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with sample data
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.4},
            {0.3, 0.4, 1.0}
        };

        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Complex operation: Generate a random matrix and add it to symmetricMatrix
        Random random = new Random();
        double[][] randomData = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randomData[i][j] = random.nextDouble();
            }
        }
        RealMatrix randomMatrix = new Array2DRowRealMatrix(randomData);
        RealMatrix combinedMatrix = symmetricMatrix.add(randomMatrix);

        // Perform some matrix operations: transpose and multiply
        RealMatrix transposedMatrix = combinedMatrix.transpose();
        RealMatrix multipliedMatrix = combinedMatrix.multiply(transposedMatrix);

        // Complex operation: Calculate the determinant of the multiplied matrix
        double determinant = new org.apache.commons.math3.linear.LUDecomposition(multipliedMatrix).getDeterminant();
        System.out.println("Determinant of the multiplied matrix: " + determinant);

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the matrix to verify the read operation
        System.out.println("Read Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional complex operation: Invert the original symmetric matrix
        RealMatrix invertedMatrix = new org.apache.commons.math3.linear.LUDecomposition(symmetricMatrix).getSolver().getInverse();
        System.out.println("Inverted Symmetric Matrix:");
        for (int i = 0; i < invertedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < invertedMatrix.getColumnDimension(); j++) {
                System.out.print(invertedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}