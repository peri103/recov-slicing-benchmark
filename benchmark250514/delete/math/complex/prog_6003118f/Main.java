import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}}; // Initialize data for the matrix
        double[][] additionalData = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}}; // Additional matrix data

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);

        // Create another matrix using a different method
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        // Perform some matrix operations
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        RealMatrix productMatrix = matrix.multiply(additionalMatrix.transpose());

        // Output results of operations
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the original matrix
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}