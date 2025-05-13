import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the vector
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(data);
        
        // Perform some operations on the vector
        double norm = sparseVector.getNorm();
        System.out.println("Norm of the sparse vector: " + norm);
        
        // Create a matrix and perform operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Use the sparse vector in a matrix-vector multiplication
        RealVector resultVector = matrix.operate(sparseVector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // More operations on the matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);
        
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(sparseVector);
        
        // Print the retrieved vector
        System.out.println("Retrieved vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
        
        // Perform some operations on the retrieved vector
        RealVector scaledVector = retrievedVector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
    }
}