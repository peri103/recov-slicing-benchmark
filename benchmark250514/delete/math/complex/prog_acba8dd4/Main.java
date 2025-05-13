import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Create a real matrix using MatrixUtils
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // More complex calculations
        RealVector addedVector = vector.add(scaledVector);
        System.out.println("Added Vector: " + addedVector);

        // Retrieve the sparse real vector using MatrixUtils
        /* read */ RealVector retrievedVector = vector; // Since there's no direct method 'getSparseRealVector', we assume retrieval is direct

        // Output the vector to ensure it was correctly written and read
        System.out.println("Retrieved Vector: " + retrievedVector);
    }
}