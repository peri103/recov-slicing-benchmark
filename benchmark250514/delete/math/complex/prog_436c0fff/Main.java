import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0}, {2.0}, {3.0}}; // Example data for the matrix
        double[][] additionalData = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}}; // Additional data for another matrix
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Create another matrix using a different method
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        
        // Perform some operations on the additional matrix
        RealVector rowVector = additionalMatrix.getRowVector(1);
        System.out.println("Row vector from additional matrix:");
        for (int i = 0; i < rowVector.getDimension(); i++) {
            System.out.print(rowVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform a matrix addition
        RealMatrix sumMatrix = matrix.add(additionalMatrix.getSubMatrix(0, 2, 0, 0));
        System.out.println("Sum matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // More unrelated operations
        double[] vectorData = {13.0, 14.0, 15.0};
        RealVector vector = MatrixUtils.createRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the values of the column matrix to verify correctness
        System.out.println("Column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}