import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 3x3 matrix with all elements initialized to 0
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);

        // Create a column vector with specific values
        double[] columnData = {1.0, 2.0, 3.0};
        RealVector columnVector = MatrixUtils.createColumnRealVector(columnData);

        /* write */ matrix.setColumnVector(0, columnVector); // Set the first column of the matrix

        // Create another matrix for additional operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        });

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(anotherMatrix);

        // Create another vector for more operations
        RealVector anotherVector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});

        // Perform vector addition
        RealVector resultVector = columnVector.add(anotherVector);

        // Print the results of the operations
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        /* read */ RealVector readVector = matrix.getColumnVector(0); // Read the first column of the matrix
        System.out.println("Read Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
    }
}