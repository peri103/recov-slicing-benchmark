import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the write method
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Additional code to make the program more complex
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform matrix multiplication
        RealMatrix resultMatrix = matrix.multiply(matrix);
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use another vector operation
        RealVector vector2 = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Read the sparse real vector using the read method
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());

        // Print the values to verify
        System.out.println("Read vector values:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }

        // Perform vector scaling
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
    }
}