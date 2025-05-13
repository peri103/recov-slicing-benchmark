import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a double array to create a RealVector
        double[] data = {1.0, 2.0, 3.0};

        // Use MatrixUtils to create a RealVector
        /* write */ RealVector vector = MatrixUtils.createRealVector(data);

        // Perform operations on the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        // Create a RealMatrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Multiply the vector with the matrix
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: ");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Additional vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector: ");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        // Read the RealVector back using the same reference
        /* read */ RealVector readVector = vector; // Since there's no getRealVector method, we use the vector directly

        // Print the first element to verify
        System.out.println("Read vector first element: " + readVector.getEntry(0));

        // Perform more operations to make the program complex
        RealVector sumVector = vector.add(scaledVector);
        System.out.println("Sum of original and scaled vector: ");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }
    }
}