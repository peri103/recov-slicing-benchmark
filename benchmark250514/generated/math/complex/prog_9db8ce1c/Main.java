import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the matrix
        double[] columnData = {1.0, 2.0, 3.0};
        
        // Create a RealMatrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Perform some unrelated operations
        double[] vectorData = {4.0, 5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = vector.mapAdd(10.0);

        // Print the result of the unrelated operations
        System.out.println("Modified Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Another unrelated operation
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);

        // Print the result of matrix multiplication
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the column matrix from the previously created matrix
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Print the extracted column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}