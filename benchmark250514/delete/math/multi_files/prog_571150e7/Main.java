import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Vector operations
        double[] data1 = {1.0, 2.0, 3.0};
        VectorOperations vectorOps = new VectorOperations(data1);

        double[] data2 = {4.0, 5.0, 6.0};
        double dotProduct = vectorOps.dotProduct(data2);
        System.out.println("Dot product: " + dotProduct);

        RealVector sumVector = vectorOps.addVectors(data2);
        System.out.println("Sum of vectors:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Matrix operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        MatrixOperations matrixOps = new MatrixOperations(matrixData);
        RealMatrix transposedMatrix = matrixOps.transposeMatrix();
        System.out.println("Transposed matrix:");
        matrixOps.printMatrix(transposedMatrix);

        // Retrieve the vector and print its values
        /* read */ RealVector retrievedVector = vectorOps.getVector();
        System.out.println("Retrieved vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }
    }
}