import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a vector using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        
        // Create a matrix using MatrixUtils
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the multiplied matrix
        for (int row = 0; row < multipliedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < multipliedMatrix.getColumnDimension(); col++) {
                System.out.print(multipliedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Perform operations on the vector
        vector.setEntry(0, 10.0);
        vector.setEntry(1, 20.0);
        vector.setEntry(2, 30.0);

        // Print the modified vector entries
        for (int i = 0; i < vector.getDimension(); i++) {
            System.out.println("Vector Entry " + i + ": " + vector.getEntry(i));
        }

        // Read the vector using MatrixUtils
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values of the read vector to verify
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println("Read Vector Entry " + i + ": " + readVector.getEntry(i));
        }

        // Create another matrix and perform operations
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][]{
            {2.0, 4.0, 6.0},
            {8.0, 10.0, 12.0},
            {14.0, 16.0, 18.0}
        });

        RealMatrix addedMatrix = matrix.add(anotherMatrix);

        // Print the added matrix
        for (int row = 0; row < addedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < addedMatrix.getColumnDimension(); col++) {
                System.out.print(addedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
    }
}