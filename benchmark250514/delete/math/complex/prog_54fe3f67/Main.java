import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using the MatrixUtils class
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Set a value in the sparse matrix for demonstration
        sparseMatrix.setEntry(1, 1, 5.0);
        
        // Create another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        anotherMatrix.setEntry(0, 0, 10.0);
        
        // Perform matrix addition
        RealMatrix resultMatrix = sparseMatrix.add(anotherMatrix);
        
        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector transformedVector = vector.mapMultiply(2.0);
        
        // Print the transformed vector
        System.out.println("Transformed Vector: " + transformedVector);
        
        // Perform matrix-vector multiplication
        RealVector matrixVectorProduct = resultMatrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Matrix-Vector Product: " + matrixVectorProduct);
        
        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares: " + sum);
        
        // Read the matrix using the MatrixUtils class
        /* read */ RealMatrix readMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the value to demonstrate that the read method works
        System.out.println(readMatrix.getEntry(1, 1));
        
        // Additional matrix operations
        RealMatrix multipliedMatrix = readMatrix.scalarMultiply(3.0);
        
        // Print the multiplied matrix entry
        System.out.println("Multiplied Matrix Entry: " + multipliedMatrix.getEntry(1, 1));
    }
}