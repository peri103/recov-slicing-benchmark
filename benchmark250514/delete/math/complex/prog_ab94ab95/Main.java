import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a triangular matrix
        double[][] data = {
            {1, 2, 3},
            {0, 4, 5},
            {0, 0, 6}
        };
        
        // Create a triangular matrix using MatrixUtils
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Create another matrix for unrelated operations
        double[][] unrelatedData = {
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15}
        };
        RealMatrix unrelatedMatrix = new Array2DRowRealMatrix(unrelatedData);

        // Perform LU decomposition on the unrelated matrix
        LUDecomposition luDecomposition = new LUDecomposition(unrelatedMatrix);
        DecompositionSolver solver = luDecomposition.getSolver();

        // Solve a system of equations using the unrelated matrix
        double[] b = {1, 2, 3};
        double[] x = solver.solve(new Array2DRowRealMatrix(b)).getColumn(0);

        // Print the solution to the system of equations
        System.out.println("Solution to the system of equations:");
        for (double value : x) {
            System.out.println(value);
        }

        // More unrelated operations
        double[][] anotherData = {
            {16, 17, 18},
            {19, 20, 21},
            {22, 23, 24}
        };
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix multipliedMatrix = unrelatedMatrix.multiply(anotherMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the read matrix to verify
        System.out.println("Read triangular matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}