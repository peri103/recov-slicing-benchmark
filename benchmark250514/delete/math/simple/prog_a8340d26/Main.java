import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with some data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Create a RealMatrix from the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector to be written into the matrix
        double[] newRowData = {10.0, 11.0, 12.0};
        RealVector newRowVector = MatrixUtils.createRowRealVector(newRowData);

        // Write the new row vector into the matrix
        /* write */ matrix.setRowVector(0, newRowVector);

        // Read the row vector back from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(0);

        // Print the read row vector
        System.out.println(readRowVector);
    }
}