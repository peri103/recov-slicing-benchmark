import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize the array with some values
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using the write method
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        ArrayRealVector scaledVector = vector.mapMultiply(2.0);
        RealMatrix matrix = new BlockRealMatrix(3, 3);
        matrix.setColumnVector(0, scaledVector);
        matrix.setColumnVector(1, vector);
        matrix.setColumnVector(2, vector.mapAdd(1.0));

        // Calculate the sum of all elements in the original vector
        double sum = vector.getL1Norm();
        System.out.println("Sum of elements: " + sum);

        // Perform some unrelated calculations
        double[] extraData = {4.0, 5.0, 6.0};
        ArrayRealVector extraVector = MatrixUtils.createArrayRealVector(extraData);
        RealVector addedVector = vector.add(extraVector);
        System.out.println("Added vector: " + addedVector);

        // Retrieve the ArrayRealVector using the read method
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector to ensure the read method works correctly
        System.out.println("Retrieved vector: " + retrievedVector);

        // Perform further operations on the retrieved vector
        RealVector normalizedVector = retrievedVector.unitVector();
        System.out.println("Normalized vector: " + normalizedVector);
    }
}