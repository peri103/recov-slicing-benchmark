import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Initialize another matrix for operations
        RealMatrix anotherMatrix = MatrixUtils.createColumnRealMatrix(new double[]{4.0, 5.0, 6.0});
        RealVector vector = new ArrayRealVector(new double[]{1.0, 0.0, -1.0});

        // Perform operations on the other matrix
        RealMatrix resultMatrix = anotherMatrix.add(MatrixUtils.createColumnRealMatrix(new double[]{0.0, 1.0, 0.0}));
        
        // Print the result matrix
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            System.out.println(resultMatrix.getEntry(i, 0));
        }

        // Perform vector operations
        RealVector transformedVector = vector.mapMultiply(2.0);
        System.out.println("Transformed Vector:");
        for (int i = 0; i < transformedVector.getDimension(); i++) {
            System.out.println(transformedVector.getEntry(i));
        }

        // Create the main matrix using the original write method
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Perform some operations on the matrix
        RealMatrix scaledMatrix = matrix.scalarMultiply(3.0);
        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            System.out.println(scaledMatrix.getEntry(i, 0));
        }

        // Use the original read method to get the column matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Display the column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}