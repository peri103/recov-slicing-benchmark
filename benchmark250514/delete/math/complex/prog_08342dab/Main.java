import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize variables
        double[][] data = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
        
        double[][] additionalData = {
            {2, 3, 4},
            {3, 6, 7},
            {4, 7, 10}
        };

        // Create a symmetric matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create another symmetric matrix for additional operations
        RealMatrix additionalMatrix = MatrixUtils.createSymmetricMatrix(additionalData);

        // Perform matrix addition
        RealMatrix sumMatrix = matrix.add(additionalMatrix);

        // Decompose the matrix and solve a linear system
        RealVector constants = new ArrayRealVector(new double[] {1, 2, 3});
        DecompositionSolver solver = new LUDecomposition(sumMatrix).getSolver();
        RealVector solution = solver.solve(constants);

        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.println(solution.getEntry(i));
        }

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);

        // Print the symmetric matrix
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}