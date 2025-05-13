import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create an identity matrix using MatrixUtils
        /* write */ RealMatrix identityMatrix = MatrixUtils.createIdentityMatrix(3);

        // Create a vector
        RealVector vector = new ArrayRealVector(new double[]{1, 2, 3});

        // Multiply the identity matrix by the vector
        RealVector resultVector = identityMatrix.operate(vector);

        // Print the result of multiplication
        System.out.println("Result of multiplying identity matrix by vector: " + resultVector);

        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2);
        RealVector addedVector = vector.add(scaledVector);

        // Print the operations results
        System.out.println("Original Vector: " + vector);
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);

        // Read the identity matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getIdentityMatrix(identityMatrix.getRowDimension());

        // Calculate the determinant of the identity matrix
        double determinant = readMatrix.getDeterminant();

        // Print the determinant of the identity matrix
        System.out.println("Determinant of the identity matrix: " + determinant);
    }
}