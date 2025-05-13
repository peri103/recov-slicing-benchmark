import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        double[] readData = readMatrix.getRow(0);
        for (double value : readData) {
            System.out.print(value + " ");
        }
    }
}