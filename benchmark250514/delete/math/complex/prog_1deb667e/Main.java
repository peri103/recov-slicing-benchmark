import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.SingularValueDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to use with the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create a RealMatrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Decompose the matrix using Singular Value Decomposition
        SingularValueDecomposition svd = new SingularValueDecomposition(matrix);
        DecompositionSolver solver = svd.getSolver();
        
        // Create another matrix for solving Ax = b
        double[][] bData = {{5.0}, {6.0}};
        RealMatrix bMatrix = new Array2DRowRealMatrix(bData);
        
        // Solve the system of equations
        RealMatrix solution = solver.solve(bMatrix);
        System.out.println("Solution Matrix:");
        for (int i = 0; i < solution.getRowDimension(); i++) {
            for (int j = 0; j < solution.getColumnDimension(); j++) {
                System.out.print(solution.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read the matrix back using the MatrixUtils class
        /* read */ double[][] readData = matrix.getData();
        
        // Output the read data to verify
        System.out.println("Original Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}