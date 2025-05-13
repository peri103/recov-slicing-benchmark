import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);
        
        // Create another matrix using Array2DRowRealMatrix
        double[][] randomData = new double[3][3];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                randomData[i][j] = rand.nextDouble() * 10;
            }
        }
        RealMatrix randomMatrix = new Array2DRowRealMatrix(randomData);

        // Perform matrix addition
        RealMatrix sumMatrix = triangularMatrix.add(randomMatrix);

        // Print the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify the values
        System.out.println("Read Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix multiplication
        RealMatrix productMatrix = triangularMatrix.multiply(randomMatrix);

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