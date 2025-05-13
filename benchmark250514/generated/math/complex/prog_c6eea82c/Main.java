import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform some matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Initialize a vector
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        // Perform operations with the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform additional operations on the matrix
        RealMatrix matrixProduct = matrix.multiply(transposedMatrix);
        System.out.println("Matrix Product:");
        for (int i = 0; i < matrixProduct.getRowDimension(); i++) {
            for (int j = 0; j < matrixProduct.getColumnDimension(); j++) {
                System.out.print(matrixProduct.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the vector
        /* read */ RealVector readVector = vector;  // Directly use the vector as there's no specific getRealVector method
        System.out.println("Original Vector:");
        System.out.println(readVector);
        
        // More complex operations
        RealVector addedVector = vector.add(scaledVector);
        System.out.println("Added Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}