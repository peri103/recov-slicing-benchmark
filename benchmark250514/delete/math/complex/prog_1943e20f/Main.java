import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 1);
        
        // Create another matrix and vector for additional complexity
        double[][] matrixData = {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(matrixData);
        RealVector anotherVector = anotherMatrix.getColumnVector(1);
        System.out.println("Another Vector: " + anotherVector);

        // Perform some operations on anotherMatrix
        RealMatrix transposedMatrix = anotherMatrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original write operation
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);
        matrix.setColumnVector(0, columnVector);

        // Some unrelated calculations
        double sum = 0.0;
        for (int i = 0; i < columnData.length; i++) {
            sum += columnData[i];
        }
        System.out.println("Sum of columnData: " + sum);

        // Original read operation
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        System.out.println("Read Vector: " + readVector);

        // More operations on the original matrix
        double[][] newMatrixData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix newMatrix = new Array2DRowRealMatrix(newMatrixData);
        RealMatrix resultMatrix = matrix.multiply(newMatrix);
        System.out.println("Resultant Matrix: ");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}