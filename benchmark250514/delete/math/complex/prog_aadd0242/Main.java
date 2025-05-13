import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        
        // Create a row vector to write into the matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        
        /* write */ matrix.setRowVector(1, rowVector); // Write the row vector into the matrix at row 1
        
        // Perform some unrelated matrix operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        
        // Create another matrix and perform operations
        double[][] anotherMatrixData = {
            {2.0, 4.0, 6.0},
            {8.0, 10.0, 12.0},
            {14.0, 16.0, 18.0}
        };
        
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        
        // Print the resulting matrices
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform calculations with the read vector
        /* read */ RealVector readVector = matrix.getRowVector(1); // Read the row vector from the matrix at row 1
        
        double dotProduct = readVector.dotProduct(MatrixUtils.createRealVector(new double[]{1.0, 1.0, 1.0}));
        System.out.println("Dot Product of Read Vector with [1.0, 1.0, 1.0]: " + dotProduct);
        
        // Create a new vector and perform operations
        RealVector newVector = MatrixUtils.createRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector addedVector = readVector.add(newVector);
        
        System.out.println("Added Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}