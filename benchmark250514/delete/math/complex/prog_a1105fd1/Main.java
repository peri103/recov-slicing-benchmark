import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] matrixData = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(matrixData);

        // Initialize another matrix for complex operations
        double[][] anotherMatrixData = {
            {4, 5, 6},
            {5, 7, 8},
            {6, 8, 10}
        };

        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);

        // Perform matrix addition
        RealMatrix resultMatrix = symmetricMatrix.add(anotherMatrix);

        // Print the result matrix
        System.out.println("Resulting Matrix after Addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(anotherMatrix);

        // Print the multiplied matrix
        System.out.println("Resulting Matrix after Multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Access the symmetric matrix value
        /* read */ double value = symmetricMatrix.getEntry(0, 0);
        System.out.println("Read Value: " + value);

        // Calculate the transpose of the result matrix
        RealMatrix transposeMatrix = resultMatrix.transpose();

        // Print the transpose matrix
        System.out.println("Transpose of Resulting Matrix:");
        for (int i = 0; i < transposeMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposeMatrix.getColumnDimension(); j++) {
                System.out.print(transposeMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}