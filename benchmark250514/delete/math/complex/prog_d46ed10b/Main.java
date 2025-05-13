import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};

        // Create a column matrix using MatrixUtils
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = columnMatrix.transpose();
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealMatrix multipliedMatrix = columnMatrix.multiply(transposedMatrix);

        // Create another matrix and vector for additional operations
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(matrixData);
        RealVector resultVector = anotherMatrix.operate(vector);

        // Perform operations on the result vector
        double[] resultArray = resultVector.toArray();
        for (double value : resultArray) {
            System.out.println("Result vector value: " + value);
        }

        // Read the column matrix using MatrixUtils
        /* read */ RealMatrix readColumnMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the values from the read column matrix
        for (int i = 0; i < readColumnMatrix.getRowDimension(); i++) {
            System.out.println("Read matrix value: " + readColumnMatrix.getEntry(i, 0));
        }

        // Additional operations on the transposed matrix
        RealMatrix addedMatrix = transposedMatrix.add(multipliedMatrix);
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.println("Added matrix value: " + addedMatrix.getEntry(row, col));
            }
        }
    }
}