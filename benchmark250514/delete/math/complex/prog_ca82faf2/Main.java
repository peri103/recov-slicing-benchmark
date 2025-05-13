import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the sparse real vector
        double[] data = {1.0, 0.0, 2.0, 0.0, 3.0};

        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Create and manipulate a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Print matrix details
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        
        System.out.println("Multiplied Matrix:");
        printMatrix(multipliedMatrix);
        
        // Some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // More unrelated code
        double[] anotherData = {4.0, 5.0, 6.0, 7.0, 8.0};
        RealVector anotherVector = MatrixUtils.createSparseRealVector(anotherData);
        RealVector combinedVector = vector.add(anotherVector);

        // Print combined vector
        System.out.println("Combined Vector: " + combinedVector);

        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);

        // Print the read vector to verify
        System.out.println("Read Vector: " + readVector);
    }

    private static void printMatrix(RealMatrix matrix) {
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                System.out.print(matrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}