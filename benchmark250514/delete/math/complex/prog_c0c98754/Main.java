import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Write the row vector to the matrix
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform some unrelated matrix operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });
        
        RealMatrix resultMatrix = matrix.multiply(anotherMatrix.transpose());
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a new vector and perform some vector operations
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector sumVector = rowVector.add(anotherVector);
        System.out.println("Sum of vectors: " + sumVector);

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        System.out.println("Read Vector: " + readVector);

        // Perform some operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the read vector: " + norm);
    }
}