import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Create another matrix
        RealMatrix additionalMatrix = MatrixUtils.createRowRealMatrix(additionalData);
        
        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(additionalMatrix.transpose());
        
        // Create a vector
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        
        // Solve a system of linear equations
        DecompositionSolver solver = new LUDecomposition(multipliedMatrix).getSolver();
        RealVector solution = solver.solve(vector);
        
        // Print the solution vector
        System.out.println("Solution Vector:");
        for (int i = 0; i < solution.getDimension(); i++) {
            System.out.print(solution.getEntry(i) + " ");
        }
        System.out.println();
        
        // Some unrelated operations
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] * additionalData[i];
        }
        System.out.println("Sum of products: " + sum);
        
        // Further operations on the matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        
        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}