import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize vector operations and write vector
        VectorOperations vectorOps = new VectorOperations();
        vectorOps.writeVector(new double[]{1.0, 2.0, 3.0});

        // Obtain the matrix from vector operations
        RealMatrix matrix = vectorOps.getMatrix();

        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations(matrix);

        // Additional complexity: Create another matrix and perform operations
        double[][] additionalMatrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);

        // Perform matrix multiplication and scaling
        RealMatrix resultMatrix = matrixOps.multiplyMatrix(additionalMatrix);
        RealMatrix scaledMatrix = matrixOps.scaleMatrix(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the row real vector
        RealVector readVector = matrixOps.readVector();
        System.out.println("Read Vector: " + readVector);
    }
}