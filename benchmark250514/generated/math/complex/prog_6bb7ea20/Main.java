import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] columnData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Create another matrix for additional operations
        RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(columnMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Print the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Sum up all elements in the result matrix
        double sum = 0;
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                sum += resultMatrix.getEntry(i, j);
            }
        }
        
        System.out.println("Sum of elements in result matrix: " + sum);
        
        // Perform some operations with the original matrix
        double trace = 0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            trace += matrix.getEntry(i, i);
        }
        
        System.out.println("Trace of the original matrix: " + trace);
        
        // Read operation
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}