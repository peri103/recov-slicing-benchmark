import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix with some values
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Initialize a vector
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform some matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Calculate the determinant of the original matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the original matrix: " + determinant);
        
        // Read a value from the original matrix
        /* read */ double value = matrix.getEntry(0, 0); // Reading the value at position (0,0)
        
        System.out.println("Read value: " + value); // Output should be 1.0
    }
}