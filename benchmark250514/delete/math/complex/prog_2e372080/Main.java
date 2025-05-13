import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a sample matrix
        double[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for additional operations
        double[][] additionalData = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);

        // Write: Create a column real vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(matrix.getColumn(0));

        // Perform some operations on the additional matrix
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Another operation: Transpose of the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read: Retrieve the column real vector from the matrix
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.print(retrievedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform a dot product operation between two vectors
        RealVector vectorA = MatrixUtils.createRealVector(new double[]{1, 2, 3});
        RealVector vectorB = MatrixUtils.createRealVector(new double[]{4, 5, 6});
        double dotProduct = vectorA.dotProduct(vectorB);
        System.out.println("Dot Product of vectorA and vectorB: " + dotProduct);

        // Scale a vector
        RealVector scaledVector = vectorA.mapMultiply(2);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
    }
}