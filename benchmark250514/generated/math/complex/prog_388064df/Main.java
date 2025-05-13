import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a RealVector using MatrixUtils
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Create a RealMatrix and perform operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Perform matrix multiplication with the vector
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Perform some vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);

        // Perform addition of two vectors
        RealVector vector2 = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector addedVector = vector.add(vector2);
        System.out.println("Added vector: " + addedVector);

        // Read the original vector
        /* read */ RealVector readVector = vector;
        
        System.out.println("Original RealVector: " + readVector);

        // Further operations on the original vector
        RealVector subtractedVector = readVector.subtract(vector2);
        System.out.println("Subtracted vector: " + subtractedVector);

        // Get the norm of the vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the vector: " + norm);
    }
}