import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with one row
        RealMatrix matrix = MatrixUtils.createRealMatrix(1, 3);

        // Create a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(rowData);

        // Set the row vector to the matrix
        matrix.setRowVector(0, rowVector);

        // Read the row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the values of the read row vector
        for (int i = 0; i < readRowVector.getDimension(); i++) {
            System.out.print(readRowVector.getEntry(i) + " ");
        }
    }
}