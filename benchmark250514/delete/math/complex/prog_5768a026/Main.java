import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix
        double[][] data = {
            {1.0, 0.0, 0.0},
            {2.0, 1.0, 0.0},
            {3.0, 2.0, 1.0}
        };

        // Create a triangular matrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(data);

        // Do some unrelated operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = triangularMatrix.operate(vector);
        
        System.out.println("Result vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform another matrix operation
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = triangularMatrix.multiply(identityMatrix);

        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the triangular matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional unrelated operations
        double norm = readMatrix.getNorm();
        System.out.println("Norm of the read matrix: " + norm);

        RealMatrix transposedMatrix = readMatrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}