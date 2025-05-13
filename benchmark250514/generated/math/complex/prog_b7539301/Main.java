import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        double[] rowData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(rowData);
        vector.mapMultiplyToSelf(2.0); // Multiply each element by 2
        
        // Print the modified vector
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Vector element " + i + ": " + vector.getEntry(i));
        }
        
        // Perform matrix operations
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);
        RealMatrix resultMatrix = matrix.multiply(rowMatrix);
        
        // Print the resulting matrix
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println("Column matrix element " + i + ": " + columnMatrix.getEntry(i, 0));
        }
        
        // Additional operations with the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}