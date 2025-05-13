import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a row real matrix
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Create a row real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Retrieve the row real matrix using the getRowMatrix method
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}