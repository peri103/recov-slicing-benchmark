import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixImpl;

public class Main {
    public static void main(String[] args) {
        // Initialize some data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Additional unrelated operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = new RealMatrixImpl(matrixData);
        double[] row = matrix.getRow(1);
        
        for (double value : row) {
            System.out.println("Matrix row value: " + value);
        }

        // Creating the ArrayRealVector using MatrixUtils
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        double norm = vector.getNorm();
        System.out.println("Vector norm: " + norm);

        // More unrelated operations
        RealMatrix matrix2 = matrix.transpose();
        double[] column = matrix2.getColumn(0);

        for (double value : column) {
            System.out.println("Transposed matrix column value: " + value);
        }

        // Reading the ArrayRealVector using MatrixUtils
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector.toArray());

        // Output the read vector values
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Read vector value: " + readVector.getEntry(i));
        }

        // Final operations
        ArrayRealVector scaledVector = readVector.mapMultiply(2.0);
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Scaled vector value: " + scaledVector.getEntry(i));
        }
    }
}