import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a sparse real vector
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Perform some operations on the vector
        vector.mapMultiplyToSelf(2.0);
        vector.setEntry(1, 5.0);
        
        // Create a matrix for demonstration
        double[][] matrixData = {{1, 2}, {3, 4}, {5, 6}};
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Multiply vector with matrix
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication: " + resultVector);

        // Another vector operation
        RealVector anotherVector = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector addedVector = vector.add(anotherVector);
        System.out.println("Result of vector addition: " + addedVector);

        // Read back the sparse real vector
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);
        
        System.out.println("Read sparse real vector: " + readVector);

        // Perform a dot product operation
        double dotProduct = vector.dotProduct(anotherVector);
        System.out.println("Dot product of vectors: " + dotProduct);
        
        // Scale the read vector and print
        RealVector scaledVector = readVector.mapMultiply(0.5);
        System.out.println("Scaled read vector: " + scaledVector);
    }
}