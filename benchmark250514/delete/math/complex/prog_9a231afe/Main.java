import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        SymmetricMatrix matrix = new SymmetricMatrix(MatrixUtils.createRealMatrix(data));

        // Initialize another matrix and perform some operations
        double[][] data2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix2.add(MatrixUtils.createRealMatrix(data));

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Write a value into the symmetric matrix
        /* write */ matrix.setEntry(1, 1, 42.0);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Read the value from the symmetric matrix
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println("Value read from symmetric matrix: " + value);

        // Perform another matrix operation
        RealMatrix multipliedMatrix = matrix2.scalarMultiply(2);

        // Print the result of scalar multiplication
        System.out.println("Result of scalar multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}