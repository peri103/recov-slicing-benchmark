import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        double[] rowData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Create a row matrix using similar API
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Perform some operations on the row matrix
        RealVector vector = new ArrayRealVector(rowMatrix.getRow(0));
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Add the scaled vector as a new column to the original matrix
        matrix = MatrixUtils.createColumnRealMatrix(scaledVector.toArray());

        // Perform matrix addition with the original column matrix
        RealMatrix resultMatrix = matrix.add(rowMatrix.transpose());
        
        // Print the result of matrix addition
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the original column matrix
        System.out.println("Original Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}