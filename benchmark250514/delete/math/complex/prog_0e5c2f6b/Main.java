import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using the write method
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create another matrix for additional operations
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 10}
        });

        // Perform LU Decomposition on matrixA
        LUDecomposition luDecomposition = new LUDecomposition(matrixA);
        DecompositionSolver solver = luDecomposition.getSolver();

        // Create a vector for solving linear equations
        RealVector b = new ArrayRealVector(new double[]{1, 2, 3});
        
        // Solve Ax = b
        RealVector solution = solver.solve(b);

        // Print the solution
        System.out.println("Solution of Ax = b:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println(solution.getEntry(i));
        }

        // Perform some operations on the identity matrix
        RealMatrix multipliedMatrix = identityMatrix.multiply(matrixA);

        // Read the matrix back using the read method
        /* read */ RealMatrix readMatrix = identityMatrix; // Since MatrixUtils doesn't have a getIdentityMatrix method, we directly use the matrix

        // Print the identity matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}