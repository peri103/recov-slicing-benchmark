import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of doubles
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Create another vector for additional operations
        double[] data2 = {4.0, 5.0, 6.0};
        ArrayRealVector vector2 = MatrixUtils.createArrayRealVector(data2);

        // Perform vector addition
        RealVector sumVector = vector.add(vector2);

        // Create a matrix
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new BlockRealMatrix(matrixData);

        // Multiply vector with matrix
        RealVector resultVector = matrix.operate(vector);

        // Perform some operations on the result vector
        double norm = resultVector.getNorm();
        System.out.println("Norm of the result vector: " + norm);

        // Use the read method to obtain the same ArrayRealVector
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // Output the content of the read vector to verify
        System.out.println(readVector);

        // Perform more operations on vectors
        double dotProduct = readVector.dotProduct(vector2);
        System.out.println("Dot product of readVector and vector2: " + dotProduct);

        // Scale the vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled vector: " + scaledVector);
    }
}