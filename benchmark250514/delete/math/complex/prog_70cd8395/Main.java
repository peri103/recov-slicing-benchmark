import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixDimensionMismatchException;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] additionalData = {{5.0, 6.0}, {7.0, 8.0}};

        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        // Perform some matrix operations
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix sumMatrix = matrix.add(additionalMatrix);

        // Calculate the transpose of the sumMatrix
        RealMatrix transposeMatrix = sumMatrix.transpose();
        
        // Create a vector and multiply with the transposeMatrix
        RealVector vector = MatrixUtils.createRealVector(new double[]{1.0, 1.0});
        RealVector resultVector = transposeMatrix.operate(vector);

        // Print the result of vector multiplication
        System.out.println("Result of vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Handling matrix dimension mismatch exception
        try {
            RealMatrix mismatchedMatrix = new Array2DRowRealMatrix(new double[][]{{1.0}, {2.0}, {3.0}});
            RealMatrix result = matrix.add(mismatchedMatrix);
        } catch (MatrixDimensionMismatchException e) {
            System.out.println("Matrix dimension mismatch occurred.");
        }

        // More complex operations
        double determinant = matrix.determinant();
        System.out.println("Determinant of the original matrix: " + determinant);

        /* read */ double[][] readData = matrix.getData();

        // Print the original matrix data
        System.out.println("Original matrix data:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}