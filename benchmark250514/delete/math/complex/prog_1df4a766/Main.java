import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 identity matrix
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        
        // Create a triangular matrix using the data
        /* write */ RealMatrix matrix = MatrixUtils.createTriangularMatrix(data);

        // Perform some additional operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = matrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More complex operations
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the triangular matrix
        /* read */ RealMatrix triangularMatrix = MatrixUtils.getTriangularMatrix(matrix);

        // Print the triangular matrix
        System.out.println("Triangular Matrix:");
        for (int i = 0; i < triangularMatrix.getRowDimension(); i++) {
            for (int j = 0; j < triangularMatrix.getColumnDimension(); j++) {
                System.out.print(triangularMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional unrelated logic
        double[] extraData = {4.0, 5.0, 6.0};
        RealVector extraVector = new ArrayRealVector(extraData);
        RealVector extraResult = transposedMatrix.operate(extraVector);

        // Print the result of extra operations
        System.out.println("Extra operation result:");
        for (int i = 0; i < extraResult.getDimension(); i++) {
            System.out.print(extraResult.getEntry(i) + " ");
        }
        System.out.println();
    }
}