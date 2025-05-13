import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(data);

        double[] vectorData = {5.0, 6.0};
        RealVector resultVector = matrixOps.multiplyWithVector(vectorData);
        System.out.println("Result of matrix-vector multiplication: " + Arrays.toString(resultVector.toArray()));

        double[][] data2 = {{7.0, 8.0}, {9.0, 10.0}};
        RealMatrix sumMatrix = matrixOps.addMatrix(data2);
        System.out.println("Sum of matrices:");
        for (double[] row : sumMatrix.getData()) {
            System.out.println(Arrays.toString(row));
        }

        double[][] originalMatrixData = matrixOps.getMatrixData();
        System.out.println("Original matrix data:");
        for (double[] row : originalMatrixData) {
            System.out.println(Arrays.toString(row));
        }
    }
}