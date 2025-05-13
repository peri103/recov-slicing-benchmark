import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix with a single row
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Read the matrix using getRowRealMatrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        // Print the row to verify
        RealVector vector = readMatrix.getRowVector(0);
        System.out.println(vector);
    }
}