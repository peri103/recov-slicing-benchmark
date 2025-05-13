import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some unrelated operations with RealVector
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Resulting vector after matrix operation: " + resultVector);

        // Calculate the determinant of the matrix
        double determinant = matrix.getDeterminant();
        System.out.println("Determinant of the matrix: " + determinant);

        // Perform matrix multiplication with another matrix
        double[][] data2 = {
            {7.0, 8.0},
            {9.0, 10.0}
        };
        RealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);
        RealMatrix multipliedMatrix = matrix.multiply(matrix2);
        System.out.println("Multiplied matrix: " + multipliedMatrix);

        // Calculate the transpose of the matrix
        RealMatrix transposeMatrix = matrix.transpose();
        System.out.println("Transpose of the matrix: " + transposeMatrix);

        // Retrieve the block of data from the original matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getBlockRealMatrix(matrix.getData(), 0, 0, 2, 2);
        
        System.out.println("Read matrix: " + readMatrix);

        // Perform addition with another matrix
        RealMatrix addedMatrix = matrix.add(matrix2);
        System.out.println("Added matrix: " + addedMatrix);
    }
}