import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used for creating a matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        // Use MatrixUtils to create a RealMatrix from the 2D array
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for additional operations
        double[][] data2 = {
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Print the result of the matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);

        // Print the result of the matrix multiplication
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the 2D array from the RealMatrix
        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved data to verify
        System.out.println("Retrieved data from original matrix:");
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}