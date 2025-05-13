import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to be used with the write method
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};

        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Create a vector and perform some operations
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix addition with another matrix
        double[][] additionalData = {{0.5, 0.5}, {0.5, 0.5}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix sumMatrix = matrix.add(additionalMatrix);

        // Print the sum matrix
        System.out.println("Sum of matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ double[][] readData = matrix.getData();

        // Print the read data to verify
        System.out.println("Read matrix data:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}