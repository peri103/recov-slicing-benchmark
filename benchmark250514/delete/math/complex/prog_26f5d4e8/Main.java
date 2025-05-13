import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Create another matrix for additional operations
        double[][] data2 = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = triangularMatrix.add(matrix2);

        // Extract a row as a vector
        RealVector vector = resultMatrix.getRowVector(1);

        // Perform scalar multiplication on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);

        // Print the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = triangularMatrix.multiply(matrix2);

        // Print the resulting matrix from multiplication
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the data from the triangular matrix
        /* read */ double[][] readData = triangularMatrix.getData();

        // Print the original triangular matrix data
        System.out.println("Original Triangular Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}