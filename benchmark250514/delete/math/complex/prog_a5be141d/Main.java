import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Additional operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        
        // Multiply the identity matrix by a vector
        RealVector resultVector = identityMatrix.operate(vector);
        
        // Print the result of the multiplication
        System.out.println("Result of multiplying identity matrix by vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Create another matrix and perform addition with the identity matrix
        RealMatrix matrixToAdd = MatrixUtils.createRealMatrix(new double[][] {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });
        
        RealMatrix sumMatrix = identityMatrix.add(matrixToAdd);
        
        // Print the resulting matrix after addition
        System.out.println("Resulting matrix after addition:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = identityMatrix; // Use the created matrix directly

        // Print the matrix to verify
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}