import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to represent a matrix
        double[][] data = { { 0, 0 }, { 0, 0 } };
        
        // Create a RealMatrix using MatrixUtils
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector using MatrixUtils and write it to the matrix
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[] { 1, 2 });
        /* write */ matrix.setColumnVector(0, columnVector);

        // Unrelated code: create another matrix and perform operations
        double[][] data2 = { { 3, 4 }, { 5, 6 } };
        RealMatrix matrix2 = new Array2DRowRealMatrix(data2);
        RealVector columnVector2 = matrix2.getColumnVector(1);
        double sum = columnVector2.getEntry(0) + columnVector2.getEntry(1);
        System.out.println("Sum of second column in matrix2: " + sum);

        // Perform operations on the original matrix
        RealMatrix resultMatrix = matrix.add(matrix2);
        System.out.println("Resultant Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column vector from the original matrix
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the values of the read vector
        System.out.println("Read Vector from original matrix:");
        System.out.println(readVector);
    }
}