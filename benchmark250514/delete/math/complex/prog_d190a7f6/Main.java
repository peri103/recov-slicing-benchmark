import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create a matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector rowVector = matrix.getRowVector(0);
        RealVector columnVector = matrix.getColumnVector(1);

        // Create another matrix using Array2DRowRealMatrix
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(matrix2);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print row and column vectors
        System.out.println("Row Vector:");
        for (int i = 0; i < rowVector.getDimension(); i++) {
            System.out.print(rowVector.getEntry(i) + " ");
        }
        System.out.println();

        System.out.println("Column Vector:");
        for (int i = 0; i < columnVector.getDimension(); i++) {
            System.out.print(columnVector.getEntry(i) + " ");
        }
        System.out.println();

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getRealMatrix(matrix);

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}