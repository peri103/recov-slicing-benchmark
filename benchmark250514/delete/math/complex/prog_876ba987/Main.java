import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(data);
        
        // Create a vector and perform operations on it
        RealVector vector = new ArrayRealVector(data);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(scaledVector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform some unrelated mathematical operations
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        double average = sum / data.length;
        System.out.println("Average of the original data: " + average);
        
        // Read the diagonal elements from the matrix
        /* read */ double[] diagonal = matrix.getDiagonal();
        
        // Print the diagonal elements
        System.out.println("Diagonal elements of the matrix:");
        for (double value : diagonal) {
            System.out.println(value);
        }
        
        // Perform additional operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}