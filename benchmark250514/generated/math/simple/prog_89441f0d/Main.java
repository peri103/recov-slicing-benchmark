import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a row matrix
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Write: Create a row real matrix using the data
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data[0]);
        
        // Read: Retrieve the row real matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.createRowRealMatrix(matrix.getRow(0));
        
        // Print the retrieved matrix
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}