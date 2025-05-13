import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using MatrixUtils
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(3);
        
        // Set some values in the vector
        vector.setEntry(0, 1.0);
        vector.setEntry(1, 2.0);
        vector.setEntry(2, 3.0);

        // Create a RealMatrix and perform some operations
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(1, 1, 2.0);
        matrix.setEntry(2, 2, 3.0);

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(matrix);

        // Print the matrix to verify
        System.out.println("Matrix multiplication result:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform vector addition
        OpenMapRealVector additionalVector = MatrixUtils.createOpenMapRealVector(3);
        additionalVector.setEntry(0, 4.0);
        additionalVector.setEntry(1, 5.0);
        additionalVector.setEntry(2, 6.0);

        OpenMapRealVector sumVector = vector.add(additionalVector);

        // Print the sum vector
        System.out.println("Vector addition result:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Read the OpenMapRealVector using MatrixUtils
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to verify
        System.out.println("Read vector entries:");
        System.out.println(readVector.getEntry(0));
        System.out.println(readVector.getEntry(1));
        System.out.println(readVector.getEntry(2));
    }
}