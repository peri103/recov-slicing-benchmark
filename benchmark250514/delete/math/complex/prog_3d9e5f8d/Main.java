import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the necessary variables
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 4.0, 5.0},
            {3.0, 5.0, 6.0}
        };

        // Create a symmetric matrix using the write method
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(transposedMatrix);
        
        // Create another matrix and vector for additional operations
        double[][] additionalData = {
            {1.0, 0.0, 2.0},
            {0.0, 1.0, 3.0},
            {2.0, 3.0, 1.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealVector vector = additionalMatrix.getRowVector(0);
        
        // Add the vector to the first row of the original matrix
        RealMatrix modifiedMatrix = symmetricMatrix.copy();
        modifiedMatrix.setRowVector(0, vector.add(modifiedMatrix.getRowVector(0)));

        // Perform further operations
        RealMatrix inverseMatrix = MatrixUtils.inverse(modifiedMatrix);
        RealMatrix resultMatrix = inverseMatrix.multiply(multipliedMatrix);

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

        // Print the result of additional operations
        System.out.println("Result Matrix after operations:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}