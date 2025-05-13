import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Additional complex operations
        double[] rowData = {4.0, 5.0, 6.0};
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);

        RealMatrix addedMatrix = matrix.add(rowMatrix.transpose());

        RealVector vector = new ArrayRealVector(columnData);
        RealVector resultVector = addedMatrix.operate(vector);

        // Unrelated complex operations
        double sum = 0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        System.out.println("Sum of result vector entries: " + sum);

        // More complex operations
        RealMatrix multipliedMatrix = addedMatrix.multiply(matrix);
        double trace = multipliedMatrix.getTrace();
        System.out.println("Trace of the multiplied matrix: " + trace);

        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println("Column Matrix Entry " + i + ": " + columnMatrix.getEntry(i, 0));
        }
    }
}