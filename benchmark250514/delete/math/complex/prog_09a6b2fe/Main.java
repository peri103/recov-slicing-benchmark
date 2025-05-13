import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Define the dimensions of the sparse matrix
        int rows = 3;
        int columns = 3;

        // Create a sparse matrix with the given dimensions
        /* write */ OpenMapRealMatrix sparseMatrix = (OpenMapRealMatrix) MatrixUtils.createSparseMatrix(rows, columns);

        // Set some values in the sparse matrix
        sparseMatrix.setEntry(0, 0, 1.0);
        sparseMatrix.setEntry(1, 1, 2.0);
        sparseMatrix.setEntry(2, 2, 3.0);

        // Create and manipulate another matrix using Array2DRowRealMatrix
        double[][] data = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(data);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(sparseMatrix);
        
        // Print the result of matrix addition
        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create and manipulate a vector using ArrayRealVector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform vector addition
        RealVector resultVector = vector.mapAdd(5.0);
        
        // Print the result of vector addition
        System.out.println("Result of Vector Addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the sparse matrix
        /* read */ RealMatrix retrievedMatrix = sparseMatrix;
        
        // Print the retrieved matrix entries
        System.out.println("Retrieved Sparse Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}