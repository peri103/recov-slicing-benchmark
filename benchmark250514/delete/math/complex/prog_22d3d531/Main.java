import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the vector
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using the write method
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Additional computations and operations
        double[] moreData = {4.0, 5.0, 6.0};
        ArrayRealVector anotherVector = new ArrayRealVector(moreData);

        // Perform vector addition
        ArrayRealVector sumVector = vector.add(anotherVector);

        // Print the sum of vectors
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Create a matrix for further operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = RealMatrixUtils.createRealMatrix(matrixData);

        // Perform matrix-vector multiplication
        ArrayRealVector resultVector = new ArrayRealVector(matrix.operate(vector));

        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the ArrayRealVector using the read method
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector.getDataRef());

        // Print the elements of the read vector to verify
        System.out.println("Elements of the read vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}