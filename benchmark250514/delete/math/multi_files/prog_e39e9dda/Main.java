import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create and manipulate a vector
        VectorOperations vectorOps = new VectorOperations(3);
        vectorOps.setEntry(0, 1.0);
        vectorOps.setEntry(1, 2.0);
        vectorOps.setEntry(2, 3.0);

        // Create and manipulate a matrix
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setEntry(0, 0, 1.0);
        matrixOps.setEntry(1, 1, 2.0);
        matrixOps.setEntry(2, 2, 3.0);

        // Perform matrix multiplication
        RealMatrix resultMatrix = matrixOps.multiply(matrixOps.getMatrix());
        System.out.println("Matrix multiplication result:");
        matrixOps.printMatrix();

        // Read the OpenMapRealVector using MatrixUtils
        OpenMapRealVector vector = vectorOps.getVector();
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);

        // Print the values to verify
        System.out.println("Read vector entries:");
        System.out.println(readVector.getEntry(0));
        System.out.println(readVector.getEntry(1));
        System.out.println(readVector.getEntry(2));
    }
}