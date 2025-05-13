import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrix creation
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a column matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(data.length);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        
        // Use LU decomposition to solve a system of equations
        RealMatrix coefficients = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        });
        RealVector constants = new ArrayRealVector(new double[] {1, 2, 3});
        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        RealVector solution = solver.solve(constants);
        
        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println(solution.getEntry(i));
        }

        // Read the column matrix from the original matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the column matrix to verify the value
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
        
        // Further operations on matrices
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        RealMatrix subtractedMatrix = multipliedMatrix.subtract(addedMatrix);
        
        // Print the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}