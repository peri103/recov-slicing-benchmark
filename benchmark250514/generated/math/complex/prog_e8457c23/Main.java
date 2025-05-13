import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Create a column matrix
        double[] columnData = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);
        
        // Perform operations on another matrix
        double[][] data = {
            {3.0, 1.0, 2.0},
            {1.0, 3.0, 1.0},
            {2.0, 1.0, 3.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(data);
        
        // Perform LU decomposition on the new matrix
        LUDecomposition luDecomposition = new LUDecomposition(anotherMatrix);
        DecompositionSolver solver = luDecomposition.getSolver();
        
        // Create a vector for solving linear equations
        RealVector constants = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        
        // Solve the equation A * x = b
        if (solver.isNonSingular()) {
            RealVector solution = solver.solve(constants);
            System.out.println("Solution: " + solution);
        } else {
            System.out.println("Matrix is singular, cannot solve.");
        }
        
        // Further operations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the column matrix from the original matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        // Print the values of the column matrix to verify the read operation
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}