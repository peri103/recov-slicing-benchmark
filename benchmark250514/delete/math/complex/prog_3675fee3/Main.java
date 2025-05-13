import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a row matrix for additional complexity
        double[][] rowData = {{4.0, 5.0, 6.0}};
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(columnData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Perform matrix multiplication
        RealMatrix resultMatrix = rowMatrix.multiply(MatrixUtils.createColumnRealMatrix(columnData));
        
        // Perform some operations on the result matrix
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Additional matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix addedMatrix = transposedMatrix.add(rowMatrix);
        
        // Iterate and print the added matrix
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = matrix.getColumnMatrix(0);
        
        // Print the read matrix column
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }
    }
}