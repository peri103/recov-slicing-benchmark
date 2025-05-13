import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column real vector from the matrix
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set the column vector to the matrix
        matrix.setColumnVector(0, columnVector);

        // Additional complex operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}});
        RealVector sumVector = matrix.getColumnVector(0).add(anotherMatrix.getColumnVector(1));
        
        System.out.println("Sum of vectors: " + sumVector);

        RealMatrix multipliedMatrix = anotherMatrix.scalarMultiply(2.0);
        System.out.println("Multiplied matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Get the column real vector from the matrix
        /* read */ RealVector retrievedVector = matrix.getColumnVector(0);

        // Print the retrieved vector
        System.out.println("Retrieved vector: " + retrievedVector);
    }
}