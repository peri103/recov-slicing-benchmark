import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array to be used for the matrix
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};

        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Perform some operations on the matrix
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + Arrays.toString(resultVector.toArray()));

        // Create another matrix and perform addition
        double[][] data2 = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix matrix2 = MatrixUtils.createArray2DRowRealMatrix(data2);
        RealMatrix sumMatrix = matrix.add(matrix2);
        System.out.println("Sum of matrices:");
        for (double[] row : sumMatrix.getData()) {
            System.out.println(Arrays.toString(row));
        }

        // Insert some unrelated code to increase complexity
        double[] vectorData = {11.0, 12.0};
        RealVector anotherVector = new ArrayRealVector(vectorData);
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product of vectors: " + dotProduct);

        // Now read the original matrix data
        /* read */ double[][] array = matrix.getData();

        // Print the read matrix data to verify
        System.out.println("Original matrix data:");
        for (double[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}