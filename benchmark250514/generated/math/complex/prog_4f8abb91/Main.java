import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a RealMatrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a RealVector for operations
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        
        // Print result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform LU decomposition and solve a linear system
        LUDecomposition decomposition = new LUDecomposition(matrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector solution = solver.solve(vector);
        
        // Print solution of the linear system
        System.out.println("Solution of the linear system:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();
        
        // Access the matrix created
        /* read */ RealMatrix readMatrix = matrix; // Directly using the matrix as MatrixUtils does not have a getRealMatrix method
        
        // Print the matrix to verify
        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform additional operations on the matrix
        RealMatrix transposedMatrix = readMatrix.transpose();
        
        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}