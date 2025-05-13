import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize necessary variables
        RealMatrix matrix;
        
        // Write operation: create an identity matrix
        /* write */ matrix = MatrixUtils.createIdentityMatrix(3);

        // Additional unrelated operations
        RealVector vector1 = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector vector2 = new ArrayRealVector(new double[] {4, 5, 6});
        
        // Perform vector operations
        RealVector sumVector = vector1.add(vector2);
        System.out.println("Sum of vectors: " + sumVector);

        // Create another matrix for multiplication
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(anotherMatrix);

        // Print the resulting matrix
        System.out.println("Resulting matrix after multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More complex operations
        RealVector scaledVector = sumVector.mapMultiply(2);
        System.out.println("Scaled vector: " + scaledVector);

        // Read operation: get the identity matrix
        /* read */ RealMatrix identityMatrix = matrix;

        // Print the identity matrix for verification
        System.out.println("Identity matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}