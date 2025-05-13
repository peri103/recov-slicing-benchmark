import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with some data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector from a row
        RealVector vector = MatrixUtils.createRowRealVector(data[1]);

        // Perform some operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);
        System.out.println("Result Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Replace the second row of the matrix with the new vector
        matrix.setRowVector(1, vector);

        // Perform more operations on the matrix
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the vector from the second row
        /* read */ RealVector readVector = matrix.getRowVector(1);

        // Print the retrieved vector
        System.out.println("Retrieved Vector:");
        System.out.println(readVector);

        // Perform operations on vectors
        RealVector sumVector = readVector.add(vector);
        System.out.println("Sum of Vectors:");
        System.out.println(sumVector);

        RealVector subVector = readVector.subtract(vector);
        System.out.println("Subtraction of Vectors:");
        System.out.println(subVector);
    }
}