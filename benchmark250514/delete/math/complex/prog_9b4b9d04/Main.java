import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector with initial values
        double[] initialValues = {1.0, 2.0, 3.0};
        
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(initialValues);
        
        // Create a dense matrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Output the result of matrix operations
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Assume some unrelated calculations
        double sum = 0;
        for (int i = 0; i < initialValues.length; i++) {
            sum += initialValues[i] * initialValues[i];
        }
        System.out.println("Sum of squares: " + sum);

        // Retrieve the sparse vector and perform a simple operation
        /* read */ RealVector retrievedVector = sparseVector;
        System.out.println("Sparse Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}