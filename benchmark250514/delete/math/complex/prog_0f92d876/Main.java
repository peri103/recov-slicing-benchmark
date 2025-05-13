import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        double[][] data = { {1.0, 2.0}, {3.0, 4.0} };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Create a vector and solve a system of equations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0});
        DecompositionSolver solver = new LUDecomposition(matrix).getSolver();
        RealVector solution = solver.solve(vector);
        
        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();
        
        // More matrix operations
        RealMatrix addedMatrix = matrix.add(transposedMatrix);
        RealMatrix subtractedMatrix = matrix.subtract(transposedMatrix);
        
        // Print the added matrix
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Print the subtracted matrix
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Extract a submatrix to simulate the read operation
        /* read */ RealMatrix readMatrix = matrix.getSubMatrix(0, 1, 0, 1); // This will read the entire matrix as a submatrix
        
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}