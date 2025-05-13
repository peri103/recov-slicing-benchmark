import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix with some values
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a RealMatrix using the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix squaredMatrix = matrix.multiply(transposedMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector multipliedVector = squaredMatrix.operate(vector);

        // Write: Create a triangular matrix from the given matrix
        /* write */ RealMatrix triangularMatrix = MatrixUtils.createTriangularMatrix(matrix);

        // Perform some unrelated operations to increase complexity
        double determinant = squaredMatrix.getDeterminant();
        RealMatrix inverseMatrix = squaredMatrix.inverse();

        // Print the determinant and inverse matrix
        System.out.println("Determinant of squared matrix: " + determinant);
        System.out.println("Inverse of squared matrix:");
        for (int row = 0; row < inverseMatrix.getRowDimension(); row++) {
            for (int col = 0; col < inverseMatrix.getColumnDimension(); col++) {
                System.out.print(inverseMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Read: Get the triangular matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getTriangularMatrix(triangularMatrix);

        // Print the matrix to verify the values
        System.out.println("Triangular matrix:");
        for (int row = 0; row < readMatrix.getRowDimension(); row++) {
            for (int col = 0; col < readMatrix.getColumnDimension(); col++) {
                System.out.print(readMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform additional operations on the vector
        RealVector addedVector = multipliedVector.add(vector);
        System.out.println("Resulting vector after addition:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
    }
}