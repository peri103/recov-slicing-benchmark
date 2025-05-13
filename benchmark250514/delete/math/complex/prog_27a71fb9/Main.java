import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a diagonal matrix
        double[] diagonal = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonal);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the result of the operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform a different operation
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Print the sum of the matrices
        System.out.println("Sum of the diagonal matrix and identity matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the diagonal matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getDiagonalMatrix(matrix);
        
        // Print the retrieved diagonal matrix
        System.out.println("Retrieved diagonal matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operations to increase complexity
        RealMatrix transposedMatrix = readMatrix.transpose();
        RealMatrix productMatrix = transposedMatrix.multiply(readMatrix);

        // Print the product of the transposed matrix and the original matrix
        System.out.println("Product of the transposed matrix and the original matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}