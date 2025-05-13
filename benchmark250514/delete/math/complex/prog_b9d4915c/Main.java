import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.4},
            {0.3, 0.4, 1.0}
        };

        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create a vector for linear algebra operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the multiplication
        System.out.println("Matrix-Vector Multiplication Result:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Decompose the matrix using LU decomposition
        LUDecomposition decomposition = new LUDecomposition(matrix);
        DecompositionSolver solver = decomposition.getSolver();

        // Solve a linear system
        RealVector solution = solver.solve(vector);

        // Print the solution of the linear system
        System.out.println("Solution of the Linear System:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();

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