import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a column array
        double[] columnData = {1.0, 2.0, 3.0};

        // Create a column real matrix using MatrixUtils
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Initialize a 2D array for another matrix
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };

        // Create a 2D row real matrix
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(columnMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }

        // Perform matrix multiplication
        RealMatrix productMatrix = matrix.multiply(matrix.transpose());

        // Print the product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}