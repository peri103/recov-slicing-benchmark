import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the data array
        double[] data = {1.0, 2.0, 3.0};

        // Create an ArrayRealVector using the write method
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);

        // Perform some operations on the vector
        double norm = vector.getNorm();
        System.out.println("Norm of the vector: " + norm);

        // Create a 3x3 identity matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        System.out.println("Identity Matrix:");
        for (int i = 0; i < identityMatrix.getRowDimension(); i++) {
            for (int j = 0; j < identityMatrix.getColumnDimension(); j++) {
                System.out.print(identityMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Multiply the vector by the identity matrix
        RealVector resultVector = identityMatrix.operate(vector);

        // Retrieve the ArrayRealVector using the read method
        /* read */ ArrayRealVector retrievedVector = MatrixUtils.getArrayRealVector(vector);

        // Print the retrieved vector to ensure it matches the original
        System.out.println("Retrieved Vector: " + retrievedVector);

        // Print the result of the multiplication
        System.out.println("Result Vector after multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}