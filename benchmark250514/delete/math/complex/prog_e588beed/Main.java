import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;

public class Main {
    public static void main(String[] args) {
        // Create a triangular matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };

        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Additional unrelated code to add complexity
        double[][] matrixData = {
            {2, 3, 1},
            {4, 0, 2},
            {1, 5, 3}
        };

        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});

        // Perform LU Decomposition
        LUDecomposition luDecomposition = new LUDecomposition(matrix);
        DecompositionSolver solver = luDecomposition.getSolver();

        // Solve the system of equations
        RealVector solution = solver.solve(vector);

        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println(solution.getEntry(i));
        }

        // More operations with the triangular matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);

        // Multiply the triangular matrix with an identity matrix
        RealMatrix resultMatrix = triangularMatrix.multiply(identityMatrix);

        // Print the result of multiplication
        System.out.println("Result of Multiplying with Identity Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix (assuming a method exists to get it back, for example purposes)
        /* read */ RealMatrix readMatrix = triangularMatrix; // As an example, directly using the matrix created

        // Print the matrix to verify
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}