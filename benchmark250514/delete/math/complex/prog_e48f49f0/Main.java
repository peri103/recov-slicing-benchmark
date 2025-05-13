import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the matrix variable
        RealMatrix identityMatrix;

        // Create an identity matrix
        /* write */ identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Perform operations on the matrix
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector resultVector = identityMatrix.operate(vector);
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of multiplying identity matrix with vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {2.0, 0.0, 0.0},
            {0.0, 2.0, 0.0},
            {0.0, 0.0, 2.0}
        });
        RealMatrix addedMatrix = identityMatrix.add(anotherMatrix);
        
        // Print the added matrix
        System.out.println("Added matrix:");
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.print(addedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Retrieve the identity matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getIdentityMatrix(identityMatrix);

        // Print the retrieved matrix
        System.out.println("Retrieved identity matrix:");
        for (int row = 0; row < retrievedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < retrievedMatrix.getColumnDimension(); col++) {
                System.out.print(retrievedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}