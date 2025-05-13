import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with a single column vector
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix and perform some operations
        double[][] anotherData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);

        // Add matrices together
        RealMatrix resultMatrix = matrix.add(anotherMatrix);

        // Write: create a column real vector
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        matrix.setColumnVector(0, columnVector);

        // Perform operations on the result matrix
        RealVector rowVector = resultMatrix.getRowVector(1);
        RealVector scaledRowVector = rowVector.mapMultiply(2.0);

        // Calculate the dot product of vectors
        double dotProduct = columnVector.dotProduct(scaledRowVector);

        // Print the dot product
        System.out.println("Dot Product: " + dotProduct);

        // Some more operations on vectors
        RealVector addedVector = columnVector.add(scaledRowVector);
        System.out.println("Added Vector: " + addedVector);

        // Read: get the column real vector
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the vector to verify the operation
        System.out.println("Read Column Vector: " + readColumnVector);

        // Perform subtraction on vectors
        RealVector subtractedVector = readColumnVector.subtract(rowVector);
        System.out.println("Subtracted Vector: " + subtractedVector);

        // Create another vector and perform operations
        RealVector anotherVector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector multipliedVector = anotherVector.ebeMultiply(readColumnVector);
        System.out.println("Element-wise Multiplied Vector: " + multipliedVector);
    }
}