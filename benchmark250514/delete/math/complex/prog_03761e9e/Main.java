import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with a single column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector and write it into the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setColumnVector(0, columnVector);

        // Additional operations on matrix
        double[][] additionalData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix resultMatrix = matrix.add(additionalMatrix);

        // Perform some calculations
        double determinant = resultMatrix.getDeterminant();
        System.out.println("Determinant of result matrix: " + determinant);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = resultMatrix.multiply(matrix);
        System.out.println("Multiplied matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column real vector from the matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        System.out.println("Read vector: " + readVector);

        // Further operations with the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}