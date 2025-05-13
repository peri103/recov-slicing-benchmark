import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Perform some unrelated operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector solution = null;
        
        try {
            DecompositionSolver solver = new LUDecomposition(matrix).getSolver();
            solution = solver.solve(vector);
        } catch (Exception e) {
            System.out.println("Matrix is singular, cannot solve.");
        }
        
        if (solution != null) {
            System.out.println("Solution Vector: ");
            for (int i = 0; i < solution.getDimension(); i++) {
                System.out.print(solution.getEntry(i) + " ");
            }
            System.out.println();
        }
        
        // Introduce another matrix operation
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);
        
        System.out.println("Read Matrix: ");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}