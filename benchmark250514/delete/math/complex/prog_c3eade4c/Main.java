import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a vector using the write method
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Perform some unrelated operations
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(1, 1, 1.0);
        matrix.setEntry(2, 2, 1.0);

        OpenMapRealVector anotherVector = new OpenMapRealVector(3);
        anotherVector.setEntry(0, 4.0);
        anotherVector.setEntry(1, 5.0);
        anotherVector.setEntry(2, 6.0);

        for (int i = 0; i < anotherVector.getDimension(); i++) {
            double value = anotherVector.getEntry(i);
            System.out.println("Another vector entry: " + value);
        }

        // More complex operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the vector using the read method
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to ensure the read method works correctly
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Read vector entry: " + readVector.getEntry(i));
        }
    }
}