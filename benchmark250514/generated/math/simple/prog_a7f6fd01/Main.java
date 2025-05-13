import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an array to represent a row vector
        double[] rowData = {1.0, 2.0, 3.0};
        
        // Use MatrixUtils to create a row real matrix
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Retrieve the row real matrix using MatrixUtils (though typically this would be done directly from the matrix object)
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Print the retrieved matrix row
        System.out.println("Retrieved Matrix Row:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}