import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 0.0, 3.0, 0.0, 5.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Step 2: Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Step 3: Create a dense real matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Step 4: Perform matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Step 5: Retrieve the sparse real vector
        /* read */ RealVector retrievedVector = vector; // Directly using the created vector as there is no specific get method in MatrixUtils

        // Step 6: Use the retrieved vector in a computation
        double dotProduct = retrievedVector.dotProduct(scaledVector);
        System.out.println("Dot Product of Retrieved and Scaled Vector: " + dotProduct);

        // Additional unrelated operations to increase complexity
        RealVector sumVector = retrievedVector.add(scaledVector);
        System.out.println("Sum Vector: " + sumVector);

        RealVector differenceVector = retrievedVector.subtract(scaledVector);
        System.out.println("Difference Vector: " + differenceVector);

        // Print the retrieved vector
        System.out.println("Retrieved Vector: " + retrievedVector);
    }
}