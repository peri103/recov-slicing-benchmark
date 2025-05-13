import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1, 2, 3};
        
        // Creating a diagonal matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Performing some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.multiply(identityMatrix);
        
        // Creating a RealVector and performing operations
        RealVector vector = new ArrayRealVector(new double[]{4, 5, 6});
        RealVector transformedVector = resultMatrix.operate(vector);
        
        // Printing the transformed vector
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.println(transformedVector.getEntry(i));
        }
        
        // Performing additional mathematical operations
        double[] additionalValues = {7, 8, 9};
        RealMatrix additionalMatrix = MatrixUtils.createDiagonalMatrix(additionalValues);
        RealMatrix combinedMatrix = matrix.add(additionalMatrix);
        
        // Retrieving the diagonal values of the original matrix
        /* read */ double[] readValues = matrix.getColumn(0); // Assuming getDiagonalMatrix is a method to retrieve the diagonal
        
        System.out.println("Original Diagonal Values:");
        for (double value : readValues) {
            System.out.println(value);
        }
        
        // Printing the combined matrix diagonal values
        System.out.println("Combined Matrix Diagonal Values:");
        double[] combinedDiagonal = combinedMatrix.getColumn(0);
        for (double value : combinedDiagonal) {
            System.out.println(value);
        }
    }
}