import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0}; // Example data for the matrix row
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        // Print the matrix row to verify the value
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}