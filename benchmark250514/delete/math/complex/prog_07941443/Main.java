import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Create a triangular matrix using the given data
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix matrixCopy = triangularMatrix.copy();
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Solve the system of linear equations
        DecompositionSolver solver = new LUDecomposition(matrixCopy).getSolver();
        if (solver.isNonSingular()) {
            RealVector solution = solver.solve(vector);
            System.out.println("Solution to the system: " + solution);
        } else {
            System.out.println("Matrix is singular, cannot solve the system.");
        }
        
        // More operations
        double[][] additionalData = {
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0},
            {16.0, 17.0, 18.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix resultMatrix = triangularMatrix.add(additionalMatrix);
        
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Retrieve the triangular matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);
        
        // Print the retrieved matrix
        System.out.println("Retrieved Triangular Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}