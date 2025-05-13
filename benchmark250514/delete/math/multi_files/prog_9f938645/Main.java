import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations(3);

        // Perform operations on vectors
        VectorOperations vectorOps = new VectorOperations();
        RealVector vector1 = new ArrayRealVector(new double[]{1, 2, 3});
        RealVector vector2 = new ArrayRealVector(new double[]{4, 5, 6});
        RealVector resultVector = vectorOps.addVectors(vector1, vector2);
        System.out.println("Result of vector addition: " + resultVector);

        // Perform matrix operations
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}});
        RealMatrix multipliedMatrix = matrixOps.multiplyWithIdentity(matrix);
        System.out.println("Multiplied matrix: " + multipliedMatrix);

        RealMatrix transposedMatrix = matrixOps.transposeMatrix(multipliedMatrix);
        System.out.println("Transposed matrix: " + transposedMatrix);

        // Read the identity matrix
        RealMatrix readMatrix;
        /* read */ readMatrix = matrixOps.getIdentityMatrix();
        System.out.println("Read matrix: " + readMatrix);

        // Further operations on vectors
        RealVector scaledVector = vectorOps.scaleVector(resultVector, 2);
        System.out.println("Scaled vector: " + scaledVector);
    }
}