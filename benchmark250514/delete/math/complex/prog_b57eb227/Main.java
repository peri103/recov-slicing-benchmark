import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a data array for the sparse vector
        double[] data = {1.0, 2.0, 3.0};
        
        // Initialize a 2x2 matrix
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Output the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create the sparse vector
        /* write */ SparseRealVector sparseVector = (SparseRealVector) MatrixUtils.createSparseRealVector(data);
        
        // Perform some unrelated operations
        double[] additionalData = {4.0, 5.0, 6.0};
        RealVector additionalVector = MatrixUtils.createRealVector(additionalData);
        RealVector sumVector = sparseVector.add(additionalVector);
        
        // Output the sum vector
        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Read the sparse vector
        /* read */ RealVector readVector = sparseVector;  // This assumes getSparseRealVector returns the same vector
        
        // Output the read vector
        System.out.println("Read Sparse Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform another operation on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        
        // Output the scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}