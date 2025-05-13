import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        double[] rowData = {7.0, 8.0, 9.0};
        RealVector rowVector = MatrixUtils.createRowRealVector(rowData);
        /* write */ matrix.setRowVector(0, rowVector);

        // Create another matrix and perform operations
        double[][] additionalData = {{10.0, 11.0, 12.0}, {13.0, 14.0, 15.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);

        RealVector columnVector = additionalMatrix.getColumnVector(1);
        RealVector sumVector = rowVector.add(columnVector);

        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println("Sum element " + i + ": " + sumVector.getEntry(i));
        }

        // Perform some calculations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealVector transposedRowVector = transposedMatrix.getRowVector(1);

        double dotProduct = rowVector.dotProduct(transposedRowVector);
        System.out.println("Dot product: " + dotProduct);

        // Access the modified row vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Modified row vector: " + readVector);

        // Additional operations on the matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealMatrix addedMatrix = matrix.add(additionalMatrix);

        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Added matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}