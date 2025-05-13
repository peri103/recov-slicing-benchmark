import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a matrix with one column using the column data
        RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        System.out.println("Written Vector: " + columnVector);
        System.out.println("Read Vector: " + readVector);
    }
}