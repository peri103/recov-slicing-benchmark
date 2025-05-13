import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0};
        
        // Create a sparse real vector
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(values);
        
        // Perform some operations on a matrix
        double[][] matrixData = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Calculate the dot product of the vector with itself
        double dotProduct = vector.dotProduct(vector);
        System.out.println("Dot Product of vector with itself: " + dotProduct);
        
        // Retrieve the sparse real vector
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);
        
        // Print the retrieved vector
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Additional complex operations
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}