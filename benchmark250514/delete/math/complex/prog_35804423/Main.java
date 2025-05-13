import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix dimensions and values
        int rows = 3;
        int columns = 3;
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 10.0}
        };
        
        // Create a sparse matrix using MatrixUtils
        /* write */ RealMatrix sparseMatrix = MatrixUtils.createSparseMatrix(data);
        
        // Perform some unrelated matrix operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 0.5, 0.2});
        
        // Solve the system of equations using LU decomposition
        LUDecomposition luDecomposition = new LUDecomposition(sparseMatrix);
        DecompositionSolver solver = luDecomposition.getSolver();
        RealVector solution = solver.solve(vector);
        
        // Print the solution vector
        System.out.println("Solution to the system:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println(solution.getEntry(i));
        }

        // Continue with some more complex operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(rows);
        RealMatrix multipliedMatrix = sparseMatrix.multiply(identityMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the sparse matrix using MatrixUtils (in this case, we will access the matrix directly)
        /* read */ RealMatrix readMatrix = sparseMatrix;
        
        // Print the matrix to verify
        System.out.println("Sparse Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}