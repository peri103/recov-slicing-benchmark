import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        // Create a diagonal matrix
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix summedMatrix = matrix.add(anotherMatrix);
        
        // Print the summed matrix
        System.out.println("Summed Matrix:");
        for (int row = 0; row < summedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < summedMatrix.getColumnDimension(); col++) {
                System.out.print(summedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Extract the diagonal values from the original matrix
        /* read */ double[] readDiagonalValues = MatrixUtils.getDiagonalMatrix(matrix);
        
        // Print the extracted diagonal values
        System.out.println("Extracted Diagonal Values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
        
        // Additional operations
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scaled Matrix:");
        for (int row = 0; row < scaledMatrix.getRowDimension(); row++) {
            for (int col = 0; col < scaledMatrix.getColumnDimension(); col++) {
                System.out.print(scaledMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}