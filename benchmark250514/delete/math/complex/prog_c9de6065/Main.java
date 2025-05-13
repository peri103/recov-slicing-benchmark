import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Create a 2x2 matrix using createBlockRealMatrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Create a vector and solve a linear equation
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        DecompositionSolver solver = new LUDecomposition(matrix).getSolver();
        RealVector solution = solver.solve(vector);
        
        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the matrix using getBlockRealMatrix
        /* read */ RealMatrix retrievedMatrix = matrix;

        // Print the contents of the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations on the matrix
        RealMatrix inverseMatrix = new LUDecomposition(matrix).getSolver().getInverse();
        System.out.println("Inverse Matrix:");
        for (int i = 0; i < inverseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < inverseMatrix.getColumnDimension(); j++) {
                System.out.print(inverseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}