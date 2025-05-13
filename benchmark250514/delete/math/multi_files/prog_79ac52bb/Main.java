import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize column data
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a MatrixOperations instance
        MatrixOperations matrixOps = new MatrixOperations(columnData);
        
        // Get the matrix from MatrixOperations
        RealMatrix matrix = matrixOps.getMatrix();
        
        // Perform complex calculations on the matrix
        ComplexCalculations calculations = new ComplexCalculations(matrix);
        
        // Initialize vector data
        double[] vectorData = {4.0, 5.0, 6.0};
        
        // Perform vector operations
        RealVector resultVector = calculations.performVectorOperations(vectorData);
        
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