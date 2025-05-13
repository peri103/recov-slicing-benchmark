import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] row = {1.0, 2.0, 3.0};

        // Create a vector for additional complexity
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = vector.mapMultiply(2.0);

        // Print the original vector and the result vector
        System.out.println("Original Vector: ");
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.print(vector.getEntry(i) + " ");
        }
        System.out.println("\nResult Vector (after multiplication): ");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for more complexity
        RealMatrix additionalMatrix = MatrixUtils.createRowRealMatrix(new double[]{7.0, 8.0, 9.0});
        RealMatrix sumMatrix = additionalMatrix.add(MatrixUtils.createRowRealMatrix(new double[]{1.0, 1.0, 1.0}));

        // Print the sum matrix
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getColumnDimension(); i++) {
            System.out.print(sumMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(row);

        // Perform some operations on the matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled Matrix: ");
        for (int i = 0; i < scaledMatrix.getColumnDimension(); i++) {
            System.out.print(scaledMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        // Continue with other unrelated calculations
        double[] anotherRow = {10.0, 11.0, 12.0};
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRow);
        RealMatrix multipliedMatrix = anotherMatrix.multiply(scaledMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix: ");
        for (int i = 0; i < multipliedMatrix.getColumnDimension(); i++) {
            System.out.print(multipliedMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);

        // Print the read matrix
        System.out.println("Read Matrix: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}