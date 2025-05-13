import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize dimensions and values for the sparse matrix
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 3.0}
        };
        
        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);
        
        // Initialize a vector for additional operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Perform matrix-vector multiplication
        RealVector resultVector = sparseMatrix.operate(vector);
        
        // Output the result of matrix-vector multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Create another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {0.0, 1.0, 0.0},
            {1.0, 0.0, 1.0},
            {0.0, 1.0, 0.0}
        });
        
        // Perform matrix addition
        RealMatrix addedMatrix = sparseMatrix.add(anotherMatrix);
        
        // Output the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the sparse matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = sparseMatrix;  // Direct assignment as placeholder for demonstration
        
        // Output the matrix to verify
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform matrix subtraction
        RealMatrix subtractedMatrix = sparseMatrix.subtract(anotherMatrix);
        
        // Output the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}