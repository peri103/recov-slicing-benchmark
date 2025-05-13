import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the sparse vector with a size and an initial value.
        double[] initialValues = {1.0, 2.0, 3.0};
        
        /* write */
        RealVector vector = MatrixUtils.createSparseRealVector(initialValues);
        
        // Perform some operations on the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);
        
        // Create a matrix and perform operations
        double[][] matrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
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
        
        // Perform vector addition
        RealVector anotherVector = MatrixUtils.createSparseRealVector(new double[]{3.0, 2.0, 1.0});
        RealVector sumVector = vector.add(anotherVector);
        
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.print(sumVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform scalar multiplication
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // More operations to make the program complex
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix productMatrix = matrix.multiply(identityMatrix);
        
        System.out.println("Product with identity matrix:");
        for (int row = 0; row < productMatrix.getRowDimension(); row++) {
            for (int col = 0; col < productMatrix.getColumnDimension(); col++) {
                System.out.print(productMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Now read the vector that was initially written
        /* read */
        RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());
        
        // Print the values to verify they match the written values.
        System.out.println("Read vector values:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}