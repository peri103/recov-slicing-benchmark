import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Write operation: create a sparse real vector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform some unrelated operations to make the program more complex
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a matrix and perform operations on it
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform vector operations
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector addedVector = vector.add(anotherVector);
        System.out.println("Added Vector: " + addedVector);

        // Read operation: get the sparse real vector (in this case, it's already stored in 'vector')
        /* read */ RealVector readVector = vector;

        // Output the vector to verify the read operation
        System.out.println("Read Vector: " + readVector);

        // Perform additional operations to increase complexity
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
        
        double dotProduct = readVector.dotProduct(anotherVector);
        System.out.println("Dot Product: " + dotProduct);

        // Generate a random vector for demonstration
        RealVector randomVector = MatrixUtils.createRealVector(new double[]{0.5, 1.5, 2.5});
        RealVector combinedVector = scaledVector.add(randomVector);
        System.out.println("Combined Vector: " + combinedVector);
    }
}