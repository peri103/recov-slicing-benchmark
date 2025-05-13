import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] matrixData = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Create another matrix for more complexity
        double[][] anotherMatrixData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherMatrixData);

        // Perform some matrix operations
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a row real vector using MatrixUtils
        /* write */ RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the row vector to the matrix
        matrix.setRowVector(0, rowVector);

        // Perform vector operations
        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector addedVector = rowVector.add(anotherVector);
        System.out.println("Added Vector: " + addedVector);

        // Get the row real vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read values
        System.out.println("Read Vector: " + readVector);

        // More operations to increase complexity
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
    }
}