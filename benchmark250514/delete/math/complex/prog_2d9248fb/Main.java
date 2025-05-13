import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some data
        double[][] initialData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Create a RealMatrix from the initial data
        RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);
        
        // Create a new column vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});
        
        // Perform some operations on the matrix
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        });
        
        // Multiply matrices
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        
        // Add the column vector to the matrix (this is the original write operation)
        matrix.setColumnVector(1, columnVector);
        
        // Calculate the determinant of the matrix
        double determinant = multipliedMatrix.getDeterminant();
        System.out.println("Determinant: " + determinant);
        
        // Extract a row vector from the matrix
        RealVector rowVector = matrix.getRowVector(0);
        System.out.println("Row Vector: " + rowVector);
        
        // Perform some more operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: " + transposedMatrix);
        
        // Finally read the column vector back from the matrix (this is the original read operation)
        /* read */ RealVector readVector = matrix.getColumnVector(1);
        
        // Print the read vector
        System.out.println("Read Column Vector: " + readVector);
        
        // Perform additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}