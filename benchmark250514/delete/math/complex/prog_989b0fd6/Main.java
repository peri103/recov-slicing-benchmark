import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealMatrixFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize an array with some values
        double[] data = {1.0, 2.0, 3.0};

        // Use the write method to create an ArrayRealVector
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        vector.mapAddToSelf(2.0); // Add 2 to each element
        vector.mapMultiplyToSelf(0.5); // Multiply each element by 0.5

        // Create a RealMatrix using MatrixUtils
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = MatrixUtils.createRealMatrix(matrixData);

        // Format the matrix for printing
        RealMatrixFormat formatter = new RealMatrixFormat();
        System.out.println("Matrix:");
        System.out.println(formatter.format(matrix));

        // Access the original ArrayRealVector using the read method
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector);

        // Print the values to ensure the read method accessed the correct data
        System.out.println("Read Vector:");
        for (double v : readVector.toArray()) {
            System.out.println(v);
        }

        // Perform additional operations to make the program more complex
        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        ArrayRealVector sumVector = readVector.add(anotherVector);

        System.out.println("Sum Vector:");
        for (double v : sumVector.toArray()) {
            System.out.println(v);
        }

        // Calculate the dot product of two vectors
        double dotProduct = readVector.dotProduct(anotherVector);
        System.out.println("Dot Product: " + dotProduct);
    }
}