import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a sparse matrix using MatrixUtils
        RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(3, 3);
        
        // Populate the matrix with some values
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);
        
        // Create another matrix for additional operations
        RealMatrix denseMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });
        
        // Perform matrix addition
        RealMatrix resultMatrix = sparseMatrix.add(denseMatrix);
        
        // Create a vector and perform vector multiplication
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = resultMatrix.operate(vector);
        
        // Perform some calculations with the vector
        double sum = 0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        
        // Print the result of vector operations
        System.out.println("Sum of vector elements: " + sum);
        
        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readSparseMatrix = MatrixUtils.getSparseMatrix(sparseMatrix);
        
        // Print the matrix to verify
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readSparseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readSparseMatrix.getColumnDimension(); j++) {
                System.out.print(readSparseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}