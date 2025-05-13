import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a sparse real vector using the MatrixUtils class
        /* write */ RealVector sparseVector = MatrixUtils.createSparseRealVector(new double[]{1.0, 2.0, 3.0});

        // Additional operations to increase complexity
        double[] data = {4.0, 5.0, 6.0};
        RealVector denseVector = new ArrayRealVector(data);
        RealMatrix matrix = MatrixUtils.createRealMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        
        // Perform some operations on the dense vector
        denseVector = denseVector.mapAdd(10);
        RealVector resultVector = matrix.operate(denseVector);

        // Print the result of matrix operation
        System.out.println("Result of matrix operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Retrieve the sparse real vector using the MatrixUtils class
        /* read */ RealVector retrievedVector = MatrixUtils.getSparseRealVector(sparseVector.toArray());

        // Print the elements of the retrieved vector to verify
        System.out.println("Retrieved sparse vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.println(retrievedVector.getEntry(i));
        }

        // Additional operations to increase complexity
        double dotProduct = denseVector.dotProduct(retrievedVector);
        System.out.println("Dot product of dense and retrieved sparse vector: " + dotProduct);

        RealVector combinedVector = denseVector.add(retrievedVector);
        System.out.println("Combined vector:");
        for (int i = 0; i < combinedVector.getDimension(); i++) {
            System.out.println(combinedVector.getEntry(i));
        }
    }
}