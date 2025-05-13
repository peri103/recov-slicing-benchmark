import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a RealMatrix with a 3x3 matrix
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);

        // Use the setEntry method to write a value to the matrix
        /* write */ matrix.setEntry(0, 0, 3.14);

        // Perform some unrelated operations to make the program more complex
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = matrix.add(identityMatrix);
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Initialize a RealVector and perform some operations
        RealVector vector = MatrixUtils.createRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector transformedVector = resultMatrix.operate(vector);
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.print(transformedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Use the getEntry method to read the value from the matrix
        /* read */ double value = matrix.getEntry(0, 0);

        // Print the value to verify it is correctly read
        System.out.println("Read value: " + value);

        // Additional operations with matrices
        RealMatrix scalarMultipliedMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Scalar Multiplied Matrix:");
        for (int i = 0; i < scalarMultipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scalarMultipliedMatrix.getColumnDimension(); j++) {
                System.out.print(scalarMultipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}