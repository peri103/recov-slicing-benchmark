import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix using createBlockRealMatrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Retrieve the matrix using getBlockRealMatrix
        /* read */ RealMatrix retrievedMatrix = matrix;

        // Print the contents of the retrieved matrix
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}