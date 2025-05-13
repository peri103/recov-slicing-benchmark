import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix dimensions
        int rows = 3;
        int columns = 3;
        
        // Create a sparse matrix using the MatrixUtils class
        /* write */ OpenMapRealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(rows, columns);
        
        // Populate the sparse matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Create another matrix for demonstration
        RealMatrix denseMatrix = new Array2DRowRealMatrix(rows, columns);
        denseMatrix.setEntry(0, 1, 4.0);
        denseMatrix.setEntry(1, 2, 5.0);
        denseMatrix.setEntry(2, 0, 6.0);
        
        // Perform matrix addition
        RealMatrix addedMatrix = sparseMatrix.add(denseMatrix);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create a vector for matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = denseMatrix.operate(vector);
        
        // Print the result of the matrix-vector multiplication
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Retrieve the sparse matrix using the MatrixUtils class
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the retrieved matrix values
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}