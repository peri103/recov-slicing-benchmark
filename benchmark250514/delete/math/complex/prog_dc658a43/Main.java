import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a random vector
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});

        // Perform matrix-vector multiplication
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the result of the multiplication
        System.out.println("Result of multiplying identity matrix with vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        });

        RealMatrix sumMatrix = identityMatrix.add(anotherMatrix);

        // Print the sum matrix
        System.out.println("Sum of identity matrix and another matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = identityMatrix; // Assuming getIdentityMatrix is a hypothetical method to retrieve the matrix

        // Print the identity matrix
        System.out.println("Identity matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create and manipulate a vector
        RealVector manipulatedVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        manipulatedVector.mapMultiplyToSelf(2.0);

        // Print the manipulated vector
        System.out.println("Manipulated vector:");
        for (int i = 0; i < manipulatedVector.getDimension(); i++) {
            System.out.print(manipulatedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}