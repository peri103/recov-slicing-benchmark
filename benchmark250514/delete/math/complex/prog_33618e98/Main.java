import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{0.0, 0.0, 0.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create a row real vector
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{1.0, 2.0, 3.0});
        /* write */ matrix.setRowVector(0, vector);
        
        // Additional complexity: Create another matrix and perform operations
        double[][] additionalMatrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(additionalMatrix);

        // Perform scalar multiplication
        RealMatrix scaledMatrix = resultMatrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More complexity: Create another vector and add it to the original vector
        RealVector anotherVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(anotherVector);

        // Print the sum vector
        System.out.println("Sum Vector: " + sumVector);

        // Read the row real vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read Vector: " + readVector);
    }
}