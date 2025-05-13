import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize column data
        double[] columnData = {1.0, 2.0, 3.0}; 
        
        // Create a row matrix for additional complexity
        double[][] rowData = {{1.0, 2.0, 3.0}};
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData[0]);
        
        // Perform some operations on the row matrix
        RealVector rowVector = new ArrayRealVector(rowData[0]);
        RealVector resultVector = rowMatrix.operate(rowVector);
        
        // Print the result of the operation
        System.out.println("Result of row matrix operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Create column matrix using the original write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform operations on the column matrix
        RealMatrix transposedMatrix = columnMatrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed column matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the column matrix using the original read method
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);
        
        // Print the retrieved matrix to verify the read operation
        System.out.println("Retrieved column matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}