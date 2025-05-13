import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a column real matrix using the write method
        double[] columnData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Additional code to make the program more complex
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);

        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Entry " + i + ": " + resultVector.getEntry(i));
        }

        // More operations with the original column matrix
        double scalar = 2.0;
        RealMatrix scaledMatrix = columnMatrix.scalarMultiply(scalar);

        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println("Scaled Matrix Entry " + i + ": " + scaledMatrix.getEntry(i, 0));
        }

        // Read the column real matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the read matrix
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println("Read Matrix Entry " + i + ": " + readMatrix.getEntry(i, 0));
        }
    }
}