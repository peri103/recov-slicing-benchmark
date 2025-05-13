import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Create a RealMatrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the resulting matrix
        System.out.println("Multiplied Matrix:");
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform operations on the RealVector
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(scaledVector);

        // Print the scaled and added vectors
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println("\nAdded Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve the RealVector
        /* read */ RealVector retrievedVector = vector;

        // Print the elements of the retrieved vector
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}