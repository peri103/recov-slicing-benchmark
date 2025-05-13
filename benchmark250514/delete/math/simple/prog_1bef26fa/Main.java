import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sample matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector
        double[] columnData = {10.0, 11.0, 12.0};
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);

        // Set the column vector to the matrix at a specific column index
        int columnIndex = 1; // For example, replace the second column
        matrix.setColumnVector(columnIndex, columnVector);

        // Read the column real vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(columnIndex);
        System.out.println("Read Column Vector: " + readColumnVector);
    }
}