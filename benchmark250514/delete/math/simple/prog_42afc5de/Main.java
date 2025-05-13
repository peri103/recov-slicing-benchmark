import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a row matrix using the write method
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Read the row matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(rowMatrix, 0);
        
        // Output the read matrix data
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}