import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations(3);

        // Initialize vector operations
        VectorOperations vectorOps = new VectorOperations(new double[]{1, 2, 3});

        // Multiply matrix by vector
        RealVector resultVector = matrixOps.multiplyWithVector(vectorOps.getVector().toArray());
        System.out.println("Result of multiplying identity matrix by vector: " + resultVector);

        // Perform vector operations
        RealVector scaledVector = vectorOps.scaleVector(2);
        RealVector addedVector = vectorOps.addVectors(scaledVector);

        System.out.println("Original Vector: " + vectorOps.getVector());
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);

        // Access the matrix from MatrixOperations
        /* read */ RealMatrix identityMatrix = matrixOps.getMatrix();
        double determinant = identityMatrix.getDeterminant();
        System.out.println("Determinant of the identity matrix: " + determinant);
    }
}