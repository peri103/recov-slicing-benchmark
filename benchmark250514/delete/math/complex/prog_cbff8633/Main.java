import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using MatrixUtils
        double[] data = {1.0, 2.0, 3.0};
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Create a dense real vector using ArrayRealVector
        RealVector denseVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform some operations on the dense vector
        RealVector resultVector = denseVector.mapAdd(10.0);
        System.out.println("Dense Vector after addition: " + resultVector);

        // Create a real matrix and perform matrix operations
        RealMatrix matrix = new BlockRealMatrix(new double[][] {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        });

        RealMatrix multipliedMatrix = matrix.scalarMultiply(2.0);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Read the sparse real vector using MatrixUtils
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());

        // Print the contents of the read vector
        System.out.println("Read Sparse Vector: " + readVector);

        // Further operations on the read vector
        double norm = readVector.getNorm();
        System.out.println("Norm of Read Vector: " + norm);

        // Create another vector and add it to the read vector
        RealVector anotherVector = new ArrayRealVector(new double[]{0.5, 1.5, 2.5});
        RealVector sumVector = readVector.add(anotherVector);
        System.out.println("Sum Vector: " + sumVector);
    }
}