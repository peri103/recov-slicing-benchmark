import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Use write method to create a column real vector
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Perform some unrelated operations
        RealMatrix unrelatedMatrix = new Array2DRowRealMatrix(new double[][]{{10, 20}, {30, 40}});
        RealVector unrelatedVector = new ArrayRealVector(new double[]{7, 8});
        RealMatrix resultMatrix = unrelatedMatrix.scalarMultiply(2);
        RealVector resultVector = unrelatedVector.mapAdd(3);

        // Print unrelated results
        System.out.println("Unrelated Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Unrelated Vector: " + resultVector);

        // Use read method to get the column real vector
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        System.out.println("Read Vector: " + readVector);

        // Perform additional operations on the matrix
        RealMatrix additionalMatrix = matrix.scalarAdd(1.5);
        System.out.println("Additional Matrix:");
        for (int i = 0; i < additionalMatrix.getRowDimension(); i++) {
            for (int j = 0; j < additionalMatrix.getColumnDimension(); j++) {
                System.out.print(additionalMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}