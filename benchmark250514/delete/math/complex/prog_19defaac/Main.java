import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.SingularValueDecomposition;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 4.0, 5.0},
            {3.0, 5.0, 6.0}
        };

        // Create a symmetric matrix using the provided method
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create another matrix for additional operations
        double[][] data2 = {
            {7.0, 8.0, 9.0},
            {8.0, 10.0, 11.0},
            {9.0, 11.0, 12.0}
        };
        RealMatrix matrix2 = MatrixUtils.createSymmetricMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix-vector multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform LU decomposition
        LUDecomposition luDecomposition = new LUDecomposition(matrix);
        DecompositionSolver solver = luDecomposition.getSolver();
        RealVector solution = solver.solve(vector);

        // Print the solution of LU decomposition
        System.out.println("Solution of LU decomposition:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();

        // Perform Singular Value Decomposition
        SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        RealMatrix uMatrix = svd.getU();

        // Print the U matrix from Singular Value Decomposition
        System.out.println("U matrix from Singular Value Decomposition:");
        for (int i = 0; i < uMatrix.getRowDimension(); i++) {
            for (int j = 0; j < uMatrix.getColumnDimension(); j++) {
                System.out.print(uMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using the provided method
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);

        // Print the symmetric matrix
        System.out.println("Symmetric matrix:");
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}