import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix object with a 3x3 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        
        // Additional RealMatrix operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });
        
        // Initialize a RealVector
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = anotherMatrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Use the setEntry method to write a value into the matrix
        /* write */ matrix.setEntry(0, 0, 5.0);
        
        // Perform some operations on the matrix
        matrix.setEntry(1, 1, 10.0);
        matrix.setEntry(2, 2, 15.0);
        
        // Calculate the sum of all elements in the matrix
        double sum = 0.0;
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                sum += matrix.getEntry(i, j);
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);
        
        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);
        
        // Print the value to verify the read operation
        System.out.println("Read value: " + value);
        
        // Additional matrix operations
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