import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sample matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix for operations
        double[][] data2 = {
            {0.5, 1.5, 2.5},
            {3.5, 4.5, 5.5},
            {6.5, 7.5, 8.5}
        };
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(matrix2);
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a column real vector
        double[] columnData = {10.0, 11.0, 12.0};
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);

        // Set the column vector to the matrix at a specific column index
        int columnIndex = 1; // For example, replace the second column
        matrix.setColumnVector(columnIndex, columnVector);

        // Perform matrix multiplication
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column real vector from the matrix
        /* read */ RealVector readColumnVector = matrix.getColumnVector(columnIndex);
        System.out.println("Read Column Vector: " + readColumnVector);

        // Perform some operations on the read vector
        RealVector scaledVector = readColumnVector.mapMultiply(2.0);
        System.out.println("Scaled Column Vector: " + scaledVector);

        // Create a new matrix using Array2DRowRealMatrix for additional operations
        RealMatrix newMatrix = new Array2DRowRealMatrix(data2);
        RealMatrix subtractedMatrix = newMatrix.subtract(matrix);
        System.out.println("Resultant Matrix after subtraction:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}