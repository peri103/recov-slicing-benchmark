import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix
        double[][] data = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };
        
        // Create a triangular matrix using the write method
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector result = triangularMatrix.operate(vector);
        
        // Output the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < result.getDimension(); i++) {
            System.out.print(result.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform operations
        double[][] data2 = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealMatrix sumMatrix = triangularMatrix.add(matrix2);

        // Output the sum matrix
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Output the matrix to verify
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}