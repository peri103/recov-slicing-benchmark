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
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);
        
        // Create a vector for additional operations
        double[] vectorData = {1, 2, 3};
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform matrix-vector multiplication
        RealVector resultVector = symmetricMatrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform matrix decomposition
        LUDecomposition decomposition = new LUDecomposition(symmetricMatrix);
        DecompositionSolver solver = decomposition.getSolver();
        RealVector solution = solver.solve(vector);
        System.out.println("Solution of the linear system:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the symmetric matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved symmetric matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform additional operations on the retrieved matrix
        RealMatrix transposedMatrix = retrievedMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}