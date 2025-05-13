import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row for demonstration
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row real vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Set the row vector to the matrix
        /* write */ matrix.setRowVector(0, rowVector);

        // Some unrelated complex operations
        double[][] anotherData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealVector columnVector = anotherMatrix.getColumnVector(1);

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Some more operations
        RealVector sumVector = rowVector.add(columnVector);
        System.out.println("Sum of Row Vector and Column Vector: " + sumVector);

        // Read the row vector from the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Output the vector to verify
        System.out.println("Read Vector: " + readVector);

        // Perform addition on read vector
        RealVector modifiedVector = readVector.mapAdd(2.0);
        System.out.println("Modified Read Vector after adding 2.0 to each element: " + modifiedVector);
    }
}