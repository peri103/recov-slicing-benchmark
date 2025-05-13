import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize some data for matrices and vectors
        double[][] data = {{1.0}, {2.0}, {3.0}};
        double[] vectorData = {4.0, 5.0, 6.0};
        
        // Create a column matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(new double[]{1.0, 2.0, 3.0});
        
        // Create another matrix and perform some operations
        RealMatrix matrix2 = MatrixUtils.createColumnRealMatrix(new double[]{4.0, 5.0, 6.0});
        RealMatrix sumMatrix = matrix.add(matrix2);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Print the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        // Perform matrix-vector multiplication
        RealVector resultVector = sumMatrix.operate(vector);
        
        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Extract the column matrix using MatrixUtils
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Print the extracted column matrix
        System.out.println("Extracted Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}