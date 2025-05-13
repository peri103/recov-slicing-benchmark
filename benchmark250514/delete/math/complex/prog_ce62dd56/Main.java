import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */
        RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create another diagonal matrix
        double[] anotherDiagonalValues = {4.0, 5.0, 6.0};
        RealMatrix anotherMatrix = MatrixUtils.createDiagonalMatrix(anotherDiagonalValues);
        
        // Add the two matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Create a vector and multiply with the sum matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = sumMatrix.operate(vector);
        
        // Print the result vector
        System.out.println("Result vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Perform some operations on the original matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the original matrix: " + determinant);
        
        // Get the diagonal of the original matrix
        /* read */
        RealMatrix readMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        double[] readDiagonalValues = readMatrix.getColumn(0);
        
        System.out.println("Read diagonal values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
        
        // Additional operations using the read matrix
        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}