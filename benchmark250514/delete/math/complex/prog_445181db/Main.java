import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Step 1: Initialize a matrix with one row and multiple columns
        double[][] matrixData = {{0.0, 0.0, 0.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Step 2: Create a row vector
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector rowVector = MatrixUtils.createRowRealVector(vectorData);
        
        // Step 3: Write the row vector into the matrix
        /* write */ matrix.setRowVector(0, rowVector);

        // Additional operations with matrices and vectors
        double[][] additionalMatrixData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalMatrixData);

        // Add the original matrix to the additional matrix
        RealMatrix sumMatrix = matrix.add(additionalMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform scalar multiplication on the row vector
        RealVector scaledVector = rowVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Step 4: Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read vector: " + readVector);

        // More operations
        RealVector anotherVector = MatrixUtils.createRowRealVector(new double[]{10.0, 11.0, 12.0});
        RealVector combinedVector = readVector.add(anotherVector);
        System.out.println("Combined Vector: " + combinedVector);

        RealMatrix transposedMatrix = sumMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}