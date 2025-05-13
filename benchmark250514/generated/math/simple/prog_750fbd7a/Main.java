import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix using MatrixUtils
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Read the row real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Print the read matrix
        System.out.println(readMatrix);
    }
}