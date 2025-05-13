import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] vectorData = {1.0, 2.0, 3.0};
        VectorOperations vectorOps = new VectorOperations(vectorData);

        double norm = vectorOps.calculateNorm();
        System.out.println("Norm of the vector: " + norm);

        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        MatrixOperations matrixOps = new MatrixOperations(matrixData);

        RealVector resultVector = matrixOps.multiplyWithVector(vectorOps.getVector());
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        /* read */ RealVector readVector = vectorOps.getVector();
        double dotProduct = vectorOps.calculateDotProduct(readVector);
        System.out.println("Dot product of vector with itself: " + dotProduct);

        double[] additionalData = {4.0, 5.0, 6.0};
        VectorOperations additionalVectorOps = new VectorOperations(additionalData);
        double distance = readVector.getDistance(additionalVectorOps.getVector());
        System.out.println("Distance between vectors: " + distance);
    }
}