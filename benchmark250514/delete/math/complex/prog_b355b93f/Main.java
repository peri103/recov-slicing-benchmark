import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Replace the first row of the matrix with the new vector
        matrix.setRowVector(0, rowVector);

        // Perform some unrelated operations on another matrix
        double[][] data2 = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        RealVector sumVector = matrix2.getColumnVector(0).add(matrix2.getColumnVector(1));
        System.out.println("Sum of first two columns in matrix2: " + sumVector);

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(matrix2);
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the vector to verify
        System.out.println("Read Vector: " + readVector);

        // Perform some operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}