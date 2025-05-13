import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] columnData = {4.0, 5.0, 6.0};
        
        // Create a column vector
        RealVector columnVector = new ArrayRealVector(columnData);
        
        // Perform matrix multiplication
        RealMatrix matrix1 = MatrixUtils.createRowRealMatrix(rowData);
        RealMatrix matrix2 = MatrixUtils.createRowRealMatrix(columnData);
        
        RealMatrix resultMatrix = matrix1.multiply(matrix2.transpose());
        
        // Some unrelated operations
        double sum = 0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        
        System.out.println("Sum of elements in resultMatrix: " + sum);
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        // Additional operations with matrix
        double trace = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            trace += matrix.getEntry(i, i);
        }
        
        System.out.println("Trace of matrix: " + trace);
        
        // More operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealMatrix addedMatrix = matrix.add(scaledMatrix);
        
        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}