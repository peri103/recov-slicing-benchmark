import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix for demonstration
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for additional operations
        double[][] data2 = {
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5}
        };
        
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        
        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);
        
        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            System.out.println(resultMatrix.getRowVector(i));
        }

        // Write: Create a row vector and set it in the original matrix
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        /* write */ matrix.setRowVector(1, rowVector);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            System.out.println(transposedMatrix.getRowVector(i));
        }

        // Some unrelated computations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        System.out.println("Identity matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            System.out.println(identityMatrix.getRowVector(i));
        }

        // Read: Get the row vector from the matrix
        /* read */ RealVector readRowVector = matrix.getRowVector(1);

        // Print the row vector to verify
        System.out.println("Modified row vector:");
        System.out.println(readRowVector);

        // Further operations with the read vector
        double norm = readRowVector.getNorm();
        System.out.println("Norm of the modified row vector: " + norm);

        // Create a new matrix using the read row vector
        RealMatrix newMatrix = new Array2DRowRealMatrix(new double[][]{
            readRowVector.toArray(),
            {0, 0, 0},
            {0, 0, 0}
        });

        System.out.println("New matrix using the modified row vector:");
        for (int i = 0; i < newMatrix.getRowDimension(); i++) {
            System.out.println(newMatrix.getRowVector(i));
        }
    }
}